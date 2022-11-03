package com.kh.homework.model.vo;

public class Product {
	
	//필드선언
	private String pName;
	private int price;
	private String brand;
	
	//setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getter
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}

}
