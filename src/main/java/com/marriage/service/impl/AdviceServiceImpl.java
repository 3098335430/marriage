package com.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.dao.AdviceDao;
import com.marriage.entity.Advice;
import com.marriage.service.AdviceService;

@Service
public class AdviceServiceImpl implements AdviceService {
	// 注入Service依赖
		@Autowired
		private AdviceDao adviceDao;
	public Advice getById(long aid) {
		
		return adviceDao.queryById(aid);
	}

	public List<Advice> getList(Integer begin, Integer end) {
		
		return adviceDao.queryAll(begin, end);
	}

	public int saveAdvice(Advice advice) {
		// TODO Auto-generated method stub
		return adviceDao.saveAdvice(advice);
	}

	public void updateAdvice(Advice advice) {
		// TODO Auto-generated method stub
		adviceDao.updateAdvice(advice);

	}

	public void delAdvice(Integer aid) {
		// TODO Auto-generated method stub
		adviceDao.delAdvice(aid);

	}

	public Integer countAdvice() {
		// TODO Auto-generated method stub
		return adviceDao.countAdvice();
	}

}
