package com.hw1.model.vo;

public class Product { // 클래스 시작
	
	// 필드부
	private String productId; // 상품아이디
	private String productName; // 상품명
	private String productArea; // 생산지
	private int price; // 가격
	private double tax; // 부가세 비율
	
	
	// 생성자부
	// 기본생성자
	public Product() {}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	
	// 메소드부
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String information() {
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}

} // 클래스 끝
