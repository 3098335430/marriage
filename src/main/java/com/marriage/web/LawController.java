package com.marriage.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marriage.entity.Law;
import com.marriage.entity.User;
import com.marriage.service.LawService;


@Controller
@RequestMapping("law/")
public class LawController {

	@Autowired
    private LawService lawService;

	@RequestMapping("{lid}")
	@ResponseBody
	public Law getById(@PathVariable Integer lid) {
		Law law = lawService.getById(lid);
		return law;
	}
	@RequestMapping("addLaw")
	public String addLaw(Law law){
		lawService.saveLaw(law);
	    return "index";
	}
	
	@RequestMapping("updateLaw")
	public String updateLaw(Model model, Law law){
		lawService.updateLaw(law);
	    return "index";
	}
	
	@RequestMapping("toUpdateLaw")
	public String toUpdateLaw(HttpServletRequest request){
		String lawId =  (String) request.getParameter("lid");
		Integer lid = Integer.parseInt(lawId);
		Law law=lawService.getById(lid);
		request.setAttribute("law",law);
	    return "update_law";
	}
	@RequestMapping("delLaw")
	public String delLaw(HttpServletRequest request){
		String lawId =  (String) request.getParameter("lid");
		Integer lid = Integer.parseInt(lawId);
		lawService.delLaw(lid);
		request.setAttribute("flag", 1);
	    return "index";
	}
}
