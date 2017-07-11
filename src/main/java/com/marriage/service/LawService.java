package com.marriage.service;

import java.util.List;

import com.marriage.entity.Advice;
import com.marriage.entity.Law;

public interface LawService {

	/**
	 * 查询法律
	 * @return
	 */
	Law getById(long lid);

	/**
	 * 查询所有法律
	 * 
	 * @return
	 */
	 List<Law> getList(Integer begin,Integer end) ;
	/**
	 * 新增法律
	 */
	int saveLaw(Law law);
	
	public void updateLaw(Law law);
	public void delLaw(Integer lid);
	public Integer countLaw();
}
