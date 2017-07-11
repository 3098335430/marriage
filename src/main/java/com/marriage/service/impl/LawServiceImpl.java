package com.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.dao.LawDao;
import com.marriage.entity.Law;
import com.marriage.service.LawService;
@Service
public class LawServiceImpl implements LawService {
@Autowired
    private LawDao lawDao;
	public Law getById(long lid) {
		// TODO Auto-generated method stub
		return lawDao.queryById(lid);
	}

	public List<Law> getList(Integer begin, Integer end) {
		// TODO Auto-generated method stub
		return lawDao.queryAll(begin, end);
	}

	public int saveLaw(Law law) {
		// TODO Auto-generated method stub
		return lawDao.saveLaw(law);
	}

	public void updateLaw(Law law) {
		// TODO Auto-generated method stub
		lawDao.updateLaw(law);

	}

	public void delLaw(Integer lid) {
		// TODO Auto-generated method stub
		lawDao.delLaw(lid);

	}

	public Integer countLaw() {
		// TODO Auto-generated method stub
		return lawDao.countLaw();
	}

}
