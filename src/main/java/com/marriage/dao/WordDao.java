package com.marriage.dao;

import org.springframework.stereotype.Repository;

import com.marriage.entity.Word;


@Repository
public interface WordDao {

	/**
	 * 通过ID查询文档关键词
	 * 
	 * @param id
	 * @return
	 */
	Word queryById(long did);
   /**
    * 根据关键词查找文章内容
    */
	Word getByWord(String word);
}

