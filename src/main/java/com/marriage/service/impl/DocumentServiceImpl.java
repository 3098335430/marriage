package com.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.dao.DocumentDao;
import com.marriage.entity.Document;
import com.marriage.service.DocumentService;
@Service
public class DocumentServiceImpl implements DocumentService {
@Autowired
   private DocumentDao documentDao;
	public Document getById(long did) {
		// TODO Auto-generated method stub
		return documentDao.queryById(did);
	}

	public List<Document> getList(Integer begin, Integer end) {
		// TODO Auto-generated method stub
		return documentDao.queryAll(begin, end);
	}

	public int saveDocument(Document document) {
		// TODO Auto-generated method stub
		return documentDao.saveDocument(document);
	}

	public void updateDocument(Document document) {
		// TODO Auto-generated method stub
		documentDao.updateDocument(document);

	}

	public void delDocument(Integer did) {
		// TODO Auto-generated method stub
		documentDao.delDocument(did);

	}

	public Integer countDocument() {
		// TODO Auto-generated method stub
		return documentDao.countDocument();
	}

	public List<Document> getByWord(String word) {
		// TODO Auto-generated method stub
		return documentDao.getByWord(word);
	}

}
