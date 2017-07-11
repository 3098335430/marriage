package com.marriage.service;

import java.util.List;

import com.marriage.entity.Advice;
import com.marriage.entity.Case;

public interface CaseService {

	/**
	 * 查询类型
	 * @return
	 */
	Case getById(long cid);

	/**
	 * 查询所有类型
	 * 
	 * @return
	 */
	 List<Case> getList(Integer begin,Integer end) ;
	/**
	 * 新增类型
	 */
	int saveCase(Case case1);
	
	public void updateCase(Case case1);
	public void delCase(Integer cid);
	public Integer countCase();
}
