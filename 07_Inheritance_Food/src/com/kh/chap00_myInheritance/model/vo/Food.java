package com.kh.chap00_myInheritance.model.vo;

public class Food {
	// 필드부 선언
	
	private String fName; // 음식이름
	private int price; //음식가격
	private String category; //음식종류
	private double starScore; // 음식별점
	
	// 생성자
	public Food() {}
	
	public Food(String fName, int price, String category, double starScore) {
		this.fName = fName;
		this.price = price;
		this.category = category;
		this.starScore = starScore;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getStarScore() {
		return starScore;
	}

	public void setStarScore(double starScore) {
		this.starScore = starScore;
	}
	
	public String information() {
		return "음식명 : " + fName + ", 가격 : " + price + ", 종류 : " + category + ", 별점 : " + starScore;
	}
	
	
	

}
