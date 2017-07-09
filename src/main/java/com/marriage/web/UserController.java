package com.marriage.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.marriage.entity.User;
import com.marriage.service.UserService;


@Controller
@RequestMapping("user/")
public class UserController {

	@Autowired
    private UserService userService;

	@RequestMapping("{uid}")
	@ResponseBody
	public User getById(@PathVariable Integer uid) {
		User user = userService.getById(uid);
		return user;
	}
	@RequestMapping("listUser")
	public String getlist(HttpServletRequest request){
		String curr = (String)request.getParameter("curr");
		Integer begin = 0;
		Integer end = 2;
		if(curr != null){
			Integer currPage = Integer.parseInt(curr);
			begin = 2 * (currPage - 1);
			end = 2 * (currPage);
		}else{
			curr = "1";
		}
	    if(end > userService.countUser()){
	    	end = userService.countUser();
	    }
	    List<User> us= userService.getList(begin,end);
	    System.out.println(userService.countUser()+"-------");
	    double count = userService.countUser() / 2.0;
	    // 放入转发参数
	    request.setAttribute("us", us);
	    request.setAttribute("curr", curr);
	    request.setAttribute("countSize", count);
	    // 放入jsp路径
	    return "listUser";
	}
	
	@RequestMapping("login")
	public String login(User user,Map<String, Object> map,HttpSession session) {
	    //登录
	    User resultUser=userService.login(user);
	    if(resultUser!=null) {
	        //跳转regist界面
	        session.setAttribute("user", resultUser);
	        return "index";
	    } else {
	        //跳转到index界面
	        //登录时填写的用户数据
	        map.put("user", user);
	        //错误信息
	        map.put("error", "用户名或密码错误，请重新填写");
	        return "login";
	    }
	}
	
	@RequestMapping("regist")  
	public String regist(Model model,User user){  
	      
	    boolean result = userService.regist(user);  
	      
	    if(result=true){  
	        //将提示信息存入域中，用以前台显示  
	      //  model.addAttribute("msg","恭喜您，注册成功！<br>注册名："+user.getUsername()); 
	        return "index";
	    }else{  
	       // model.addAttribute("msg","服务器异常，注册失败！");  
	        return "regist";
	    }   
	}  

	@RequestMapping("addUser")
	public String addUser(User user){
		userService.saveUser(user);
		System.out.println("---------------");
	//	ModelAndView mav = new ModelAndView("redirect:/listUser");
	    return "index";
	}
	
	@RequestMapping("updateUser")
	public String updateUser(Model model, User user){
		userService.updateUser(user);
	    return "index";
	}
	
	@RequestMapping("toUpdateUser")
	public String toUpdateUser(HttpServletRequest request){
		String userid =  (String) request.getParameter("userId");
		System.out.println(userid);
		Integer userId = Integer.parseInt(userid);
		User user = userService.getById(userId);
		request.setAttribute("user", user);
	    return "update";
	}
	@RequestMapping("delUser")
	public String delUser(HttpServletRequest request){
		String userid =  (String) request.getParameter("userId");
		System.out.println(userid);
		Integer userId = Integer.parseInt(userid);
		userService.delUser(userId);
		request.setAttribute("flag", 1);
	    return "index";
	}
}
