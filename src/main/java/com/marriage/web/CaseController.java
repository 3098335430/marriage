package com.marriage.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marriage.entity.Case;
import com.marriage.service.CaseService;


@Controller
@RequestMapping("case/")
public class CaseController {

	@Autowired
    private CaseService caseService;

	@RequestMapping("{cid}")
	@ResponseBody
	public Case getById(@PathVariable Integer cid) {
		Case case1 = caseService.getById(cid);
		return case1;
	}
	
}
