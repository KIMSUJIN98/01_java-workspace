package com.kh.chap01_poly.practice02_electronic.model.vo;

public class Electronic {
	// 핃드부
	private String pName;	// 제품명
	private String open;	// 제조년월
	private int price;		// 가격
	
	// 생성자부
	// 기본생성자
	public Electronic() {}
	
	// 매개변수생성자
	public Electronic(String pName, String open, int price) {
		this.pName = pName;
		this.open = open;
		this.price = price;
	}

	// 메소드부
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "제품명 : " + pName + ", 제조년월 : " + open + ", 가격 : " + price;
	}
	
	
}
