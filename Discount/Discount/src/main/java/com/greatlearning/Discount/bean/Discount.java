package com.greatlearning.Discount.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Discount {
	
	@Id
	private int did;
	private String dname;
	
	public Discount() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Discount(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	

}
