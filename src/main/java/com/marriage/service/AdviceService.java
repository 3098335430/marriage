package com.marriage.service;

import java.util.List;

import com.marriage.entity.Advice;

public interface AdviceService {

	/**
	 * 查询建议
	 * @return
	 */
	Advice getById(long aid);

	/**
	 * 查询所有建议
	 * 
	 * @return
	 */
	 List<Advice> getList(Integer begin,Integer end) ;
	/**
	 * 新增建议
	 */
	int saveAdvice(Advice advice);
	
	public void updateAdvice(Advice advice);
	public void delAdvice(Integer aid);
	public Integer countAdvice();
}
