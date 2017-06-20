package com.marriage.web;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

@RequestMapping("login")
public String login(User user,Map<String, Object> map,HttpSession session) {
    //登录
    User resultUser=userService.login(user);
    if(resultUser!=null) {
        //跳转regist界面
        session.setAttribute("user", resultUser);
        return "login_success";
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
        return "regist_success";
    }else{  
       // model.addAttribute("msg","服务器异常，注册失败！");  
        return "regist";
    }   
}  
}
