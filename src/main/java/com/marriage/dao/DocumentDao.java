package com.marriage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.marriage.entity.Case;
import com.marriage.entity.Document;



public interface DocumentDao {
	/**
	 * 通过ID查询文档
	 * 
	 * @param id
	 * @return
	 */
	Document queryById(long id);

	/**
	 *查询所有文档
	 */
	List<Document> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	/**
	 * 向数据库中插入一个文档对象
	 * @return
	 */
	int saveDocument(Document document1);
	
	
	/**
	 * update 文档
	 */
	public void updateDocument(Document document);
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 */
	public void delDocument(Integer did);
	
	/**
	 * 统计类型条数
	 */
	public Integer countDocument();
}
