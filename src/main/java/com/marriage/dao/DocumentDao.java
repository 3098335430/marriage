package com.marriage.dao;

import java.awt.print.Book;
import java.util.List;

import com.marriage.entity.Document;
import com.marriage.entity.Page;

public interface DocumentDao {
	/**
	 * 向数据库中添加文档
	 */
	int saveDocument(Document doc);
	/**
	 * 根据id从数据库中删除文档
	 */
	int delDoc(long docId);
	/**
	 * 修改文档
	 */
	int updateDoc(Document doc);

	/**
	 * 获取所有文档
	 */
	List<Document> getDocumentList();
	/**
	 * 根据id获取文档
	 */
	Document getDocumentById(long docId);
    /**
     * 通过分页查找文档信息
     * @param page
     * @return
     */
	Page<Document> findDocument(Page<Document> page);
    

}
