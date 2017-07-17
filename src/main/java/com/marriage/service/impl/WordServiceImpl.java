package com.marriage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.dao.WordDao;
import com.marriage.entity.Word;
import com.marriage.service.WordService;
@Service
public class WordServiceImpl implements WordService {
	// 注入Service依赖
		@Autowired
		private  WordDao wordDao;
	public Word getById(Integer wid) {
		// TODO Auto-generated method stub
		return wordDao.queryById(wid);
	}

	public Word getByWord(String word) {
		// TODO Auto-generated method stub
		return wordDao.getByWord(word);
	}

}
