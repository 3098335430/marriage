package com.marriage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.marriage.entity.Word;
import com.marriage.service.WordService;

/**
根据关键字返回文章内容
 */
@Controller
@RequestMapping("ContentController")
public class ContentController {
	@Autowired
    private WordService wordService;
	@RequestMapping(value = "/content.json", method = RequestMethod.POST)
	@ResponseBody
	public Object content(@ModelAttribute String keyword) {
		Word word=wordService.getByWord("%"+keyword+"%");
	   String title=word.getTitle();
	   String content=word.getContent();
	   return title+content;
	}
}
