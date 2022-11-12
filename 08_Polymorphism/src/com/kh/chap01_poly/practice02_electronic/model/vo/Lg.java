package com.kh.chap01_poly.practice02_electronic.model.vo;

public class Lg extends Electronic {
	
	// 필드부
	public static final String OS = "Android";
	private String situation; 	// 사업 현황 : 스마트폰 사업 종료
	
	// 생성자
	// 기본생성자
	public Lg() {}
	
	// 매개변수 생성자
	public Lg(String pName, String open, int price, String situation) {
		super(pName, open, price);
		this.situation = situation;
	}

	// 메소드부
	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	@Override
	public String toString() {
		return "Lg [ " + super.toString() + ", 사업 현황 : " + situation + " ]";
	}
	
}
