package com.springmvc.controller;

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
@RequestMapping("RegisteredController")
public class RegisteredController {
	@Autowired
    private UserService userService;
// 由于是提交数据所以我们这里使用POST请求
@RequestMapping(value = "/registered_post.json", method = RequestMethod.POST)
@ResponseBody
// 此处@ModelAttribute 可以吧POST请求所携带的json字符串自动解析成后面所写的实体类
// ，然后就直接可以通过这个UserEntity取到Android端传过来的数据
public Object registered(@ModelAttribute User entity) {
String username = entity.getUsername();
String password = entity.getPassword();
boolean result = userService.regist(entity);  

if(result=true){  
	// 成功返回消息告诉Android端
	Map<String, String> map = new HashMap<String, String>();
	map.put("msg", "注册成功！");
	return map;
	} else {
	// 失败返回消息告诉Android端
	Map<String, String> map = new HashMap<String, String>();
	map.put("msg", "注册失败！");
	return map;
	}  
}
}
