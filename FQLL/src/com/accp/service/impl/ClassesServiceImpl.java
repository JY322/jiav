package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.bean.Classes;
import com.accp.dao.ClassesDao;
import com.accp.service.ClassesService;

@Transactional
@Service
public class ClassesServiceImpl implements ClassesService {

	@Autowired
	private ClassesDao claDao;
	public void setClaDao(ClassesDao claDao) {
		this.claDao = claDao;
	}

	public List<Classes> findClasses() {
		return this.claDao.findClasses();
	}
	
}
