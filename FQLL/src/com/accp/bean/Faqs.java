package com.accp.bean;

import java.io.Serializable;
import java.sql.Date;

public class Faqs implements Serializable{
	private int id;
	private String title;
	private String createdate;
	private String content;
	private Classes cla;
	
	public Faqs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faqs(int id, String title, String createdate, String content,
			Classes cla) {
		super();
		this.id = id;
		this.title = title;
		this.createdate = createdate;
		this.content = content;
		this.cla = cla;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Classes getCla() {
		return cla;
	}

	public void setCla(Classes cla) {
		this.cla = cla;
	}
}
