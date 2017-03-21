package com.accp.service;

import com.accp.bean.Faqs;
import com.accp.bean.PageBean;

public interface FaqsService {

	PageBean<Faqs> findPageFaqs(Integer currPage);

	void delFaqsById(Integer id);

	void addFaqs(Faqs faqs);

}
