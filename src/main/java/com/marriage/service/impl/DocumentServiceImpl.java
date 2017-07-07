package com.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.dao.DocumentDao;
import com.marriage.entity.Document;
import com.marriage.service.DocumentService;


@Service
public class DocumentServiceImpl implements DocumentService {

	// 注入Service依赖
	@Autowired
	private DocumentDao documentDao;


	@Override
	public Document getById(long dId) {
		return documentDao.getDocumentById(dId);
	}

	@Override
	public List<Document> getList() {
		return documentDao.getDocumentList();
	}
}
