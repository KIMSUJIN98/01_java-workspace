package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop { // 클래스 시작
	// 필드부
	private String brand; 		// 브랜드명
	private String pCode; 		// 상품코드
	private String pName; 		// 상품명
	private int price; 			// 상품가격
	private boolean allInOne; 	// 일체여부
	
	// 생성자부
	// 기본생성자
	public Desktop() {}

	// 매개변수 생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}

	// 메소드부
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 주목!!!!
	// boolean은 getAllInOne이 아닌 isAllInOne이다. 
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price + ", allInOne : " + allInOne;
	}
	

} // 클래스 끝
