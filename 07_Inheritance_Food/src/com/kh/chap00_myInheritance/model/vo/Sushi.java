package com.kh.chap00_myInheritance.model.vo;

public class Sushi extends Food {
	// 필드선언
	private String source; // 소스종류
	
	// 생성자
	public Sushi() {}
	
	public Sushi(String fName, int price, String category, double starScore, String source) {
		super(fName, price, category, starScore);
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	public String information() {
		return super.information() + ", 소스종류 : " + source;
	}
	

}
