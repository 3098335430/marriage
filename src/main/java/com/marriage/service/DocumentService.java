package com.marriage.service;

import java.util.List;

import com.marriage.entity.Document;
import com.marriage.entity.User;


/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface DocumentService {

	/**
	 * 查询文档
	 */
	Document getById(long dId);

	/**
	 * 查询所有文档
	 * 
	 * @return
	 */
	List<Document> getList();
}
