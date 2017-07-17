package com.marriage.service;

import com.marriage.entity.Word;

public interface WordService {
/**
 * 查询文档的关键词
 */
	Word getById(Integer wid);
	/**
	 * 根据关键词获取文章内容，现获取word类，再取其title和content
	 */
	Word getByWord(String word);
}
