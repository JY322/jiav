package com.accp.dao;

import java.util.List;

import com.accp.bean.Faqs;

public interface FaqsDao {

	public Integer findCount();

	public List<Faqs> findByPage(Integer begin, Integer end);

	public void delFaqsById(Integer id);

	public void addFaqs(Faqs faqs);

}
