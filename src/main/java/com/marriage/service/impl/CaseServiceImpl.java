package com.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.dao.CaseDao;
import com.marriage.entity.Case;
import com.marriage.service.CaseService;

@Service
public class CaseServiceImpl implements CaseService {
	// 注入Service依赖
		@Autowired
		private CaseDao caseDao;
		
	public int saveCase(Case case1) {
		// TODO Auto-generated method stub
		return caseDao.saveCase(case1);
	}

	public void updateCase(Case case1) {
		// TODO Auto-generated method stub
		caseDao.updateCase(case1);
	}

	public void delCase(Integer cid) {
		// TODO Auto-generated method stub
		caseDao.delCase(cid);
	}

	public Integer countCase() {
		// TODO Auto-generated method stub
		return caseDao.countCase();
	}

	public Case getById(long cid) {
		// TODO Auto-generated method stub
		return caseDao.queryById(cid);
	}

	public List<Case> getList(Integer begin, Integer end) {
		// TODO Auto-generated method stub
		return caseDao.queryAll(begin, end);
	}

}
