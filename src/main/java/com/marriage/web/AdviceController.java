package com.marriage.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marriage.entity.Advice;
import com.marriage.entity.User;
import com.marriage.service.AdviceService;


@Controller
@RequestMapping("advice/")
public class AdviceController {

	@Autowired
    private AdviceService adviceService;

	@RequestMapping("{aid}")
	@ResponseBody
	public Advice getById(@PathVariable Integer aid) {
		Advice advice = adviceService.getById(aid);
		return advice;
	}
	@RequestMapping("updateAdvice")
	public String updateAdvice(Model model,Advice advice){
		adviceService.updateAdvice(advice);
	    return "index";
	}
	
	@RequestMapping("toUpdateAdvice")
	public String toUpdateAdvice(HttpServletRequest request){
		String adviceId =  (String) request.getParameter("aid");
		Integer aid = Integer.parseInt(adviceId);
		Advice advice=adviceService.getById(aid);
		request.setAttribute("advice", advice);
	    return "update_advice";
	}
	@RequestMapping("delAdvice")
	public String delAdvice(HttpServletRequest request){
		String adviceId =  (String) request.getParameter("aid");
		Integer aid = Integer.parseInt(adviceId);
		adviceService.delAdvice(aid);
		request.setAttribute("flag", 1);
	    return "index";
	}
	@RequestMapping("addAdvice")
	public String addAdvice(Advice advice){
		adviceService.saveAdvice(advice);
	    return "index";
	}
	
	
}
