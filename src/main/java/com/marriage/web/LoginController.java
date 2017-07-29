package com.marriage.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.marriage.entity.User;
import com.marriage.service.UserService;


@Controller
@RequestMapping("LoginController")
public class LoginController {
	@Autowired
    private UserService userService;
	// 路径参数{name}填入用户名，{pass}填入密码。我们设置为GET请求。
	@RequestMapping(value = "/login_get.json", method = RequestMethod.POST)
	@ResponseBody
	// 当使用@RequestMapping URI template 样式映射时， 即 /login_get.json/{name}/{pass},
	// 这时的name和pass可通过 @Pathvariable注解绑定它传过来的值到方法的参数上。
	public Object login(@ModelAttribute User user) {
		User resultUser=userService.login(user);
		if(resultUser!=null) {
	        return user;
	    } else {
	    	Map map = new HashMap();
			map.put("msg", "登录失败，请检查用户名和密码是否正确");
			return map;// 登录失败给Android端返回一个错误消息提醒用户
	    }
	}
}