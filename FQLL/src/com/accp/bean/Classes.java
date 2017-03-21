package com.accp.bean;

import java.io.Serializable;
import java.util.List;

public class Classes implements Serializable{
	private int id;
	private String cname;
	private List<Classes> faqList;
	
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classes(int id, String cname, List<Classes> faqList) {
		super();
		this.id = id;
		this.cname = cname;
		this.faqList = faqList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Classes> getFaqList() {
		return faqList;
	}

	public void setFaqList(List<Classes> faqList) {
		this.faqList = faqList;
	}
	
}
