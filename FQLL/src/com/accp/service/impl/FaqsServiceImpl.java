package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.FaqsDao;
import com.accp.bean.Faqs;
import com.accp.bean.PageBean;
import com.accp.service.FaqsService;

@Transactional
@Service
public class FaqsServiceImpl implements FaqsService{
	
	@Autowired
	private FaqsDao faqsDao;
	public void setFaqsDao(FaqsDao faqsDao) {
		this.faqsDao = faqsDao;
	}

	public PageBean<Faqs> findPageFaqs(Integer currPage) {
		PageBean<Faqs> pageBean = new PageBean<Faqs>();
		pageBean.setCurrPage(currPage);
		Integer pageSize = 3;
		pageBean.setPageSize(pageSize);
		Integer totalCount = this.faqsDao.findCount();
		pageBean.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		Integer begin = (currPage-1)*pageSize;
		Integer end = begin+pageSize;
		List<Faqs> list = this.faqsDao.findByPage(begin,end);
		pageBean.setList(list);
		return pageBean;
	}

	public void delFaqsById(Integer id) {
		this.faqsDao.delFaqsById(id);
	}

	public void addFaqs(Faqs faqs) {
		this.faqsDao.addFaqs(faqs);
	}

}
