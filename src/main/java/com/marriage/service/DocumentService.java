package com.marriage.service;

import java.util.List;

import com.marriage.entity.Advice;
import com.marriage.entity.Case;
import com.marriage.entity.Document;

public interface DocumentService {

	/**
	 * 查询文档
	 * @return
	 */
	Document getById(long did);

	/**
	 * 查询所有文档
	 * 
	 * @return
	 */
	 List<Document> getList(Integer begin,Integer end) ;
	/**
	 * 新增文档
	 */
	int saveDocument(Document document);
	
	public void updateDocument(Document document);
	public void delDocument(Integer did);
	public Integer countDocument();
}
