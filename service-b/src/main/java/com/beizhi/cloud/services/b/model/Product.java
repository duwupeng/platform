package com.beizhi.cloud.services.b.model;

import java.util.Date;

public class Product {

	private String name;
	private Date createtime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
