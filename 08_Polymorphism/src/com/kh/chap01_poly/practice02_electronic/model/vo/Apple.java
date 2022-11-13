package com.kh.chap01_poly.practice02_electronic.model.vo;

public class Apple extends Electronic {
	
	// 필드부
	private static final String OS = "ios";
	private String version; // 현재 ios 버전
	
	// 생성자부
	// 기본생성자
	public Apple() {}
	
	// 매개변수 생성자
	public Apple(String pName, String open, int price, String version) {
		super(pName, open, price);
		this.version = version;
	}
	
	// 메소드부
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Apple [ " + super.toString() + ", version : " + version + " ]";
	}
	
	
}
