package com.greatlearning.shopforhome.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String pname;
	private float price;
	private String url;
	public String category;
	private int quantity;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart(int cid, String pname, float price, String url, String category, int quantity) {
		super();
		this.cid = cid;
		this.pname = pname;
		this.price = price;
		this.url = url;
		this.category = category;
		this.quantity = quantity;
	}
	public Cart() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
	

	
	
}
