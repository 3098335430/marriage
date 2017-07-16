package com.marriage.web;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 根据类型返回判决结果
 */
@Controller
@RequestMapping("ResultController")
public class ResultController {
		@RequestMapping(value = "/result.json/{cid}", method = RequestMethod.GET)
		@ResponseBody
		public Object result(@PathVariable Integer cid) {
			Map<String, String> map = new HashMap<String, String>();
		if(cid<=26) {
		       map.put("msg","根据相关婚姻法规定,离婚败诉可能性更大");
		       return map;
		    } 
		else if(cid<=34){
		    	map.put("msg","根据相关婚姻法规定,离婚败诉可能性更大");
				return map;// 登录失败给Android端返回一个错误消息提醒用户
		    }
		else{
		    	map.put("msg","出现异常");
				return map;
		    }

		}
	}
