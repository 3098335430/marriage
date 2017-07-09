package com.marriage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marriage.entity.Document;
import com.marriage.service.DocumentService;


@Controller
@RequestMapping("documnet/")
public class DocumentController {

	@Autowired
    private DocumentService documentService;

	@RequestMapping("{did}")
	@ResponseBody
	public Document getById(@PathVariable Integer did) {
		Document document = documentService.getById(did);
		return document;
	}
	
}
