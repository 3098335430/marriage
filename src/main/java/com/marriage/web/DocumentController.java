package com.marriage.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.marriage.entity.Document;
import com.marriage.entity.User;
import com.marriage.service.DocumentService;


@Controller
@RequestMapping("document/")
public class DocumentController {

	@Autowired
    private DocumentService documentService;

	@RequestMapping("{did}")
	@ResponseBody
	public Document getById(@PathVariable Integer did) {
		Document document = documentService.getById(did);
		return document;
	}
	@RequestMapping("addDocument")
	public String addDocument(Document document){
		documentService.saveDocument(document);
	    return "index";
	}
	@RequestMapping("updateDocument")
	public String updateDocument(Model model,Document document){
		documentService.updateDocument(document);
	    return "index";
	}
	
	@RequestMapping("toUpdateDocument")
	public String toUpdateDocument(HttpServletRequest request){
		String docid =  (String) request.getParameter("did");
		Integer did = Integer.parseInt(docid);
		Document document=documentService.getById(did);
		request.setAttribute("document", document);
	    return "update_document";
	}
	@RequestMapping("delDocument")
	public String delDocument(HttpServletRequest request){
		String docid =  (String) request.getParameter("did");
		Integer did = Integer.parseInt(docid);
		documentService.delDocument(did);
		request.setAttribute("flag", 1);
	    return "index";
	}
	@RequestMapping("detailDocument")
	public String detailDocument(HttpServletRequest request){
		String docid =  (String) request.getParameter("did");
		Integer did = Integer.parseInt(docid);
		Document document=documentService.getById(did);
		System.out.println( document.getTitle());
		request.setAttribute("title", document.getTitle());
		request.setAttribute("content", document.getContent());
	    return "detailDocument";
	}



 
	 
}
