package com.kh.chap01_poly.practice02_electronic.model.vo;

public class Samsung extends Electronic {
	
	// 필드부
	public static final String OS = "Android";
	private String sNum;	// 서비스센터 번호
	
	// 기본생성자
	public Samsung() {}

	// 매개변수 생성자
	public Samsung(String pName, String open, int price, String sNum) {
		super(pName, open, price);
		this.sNum = sNum;
	}

	// 메소드부
	public String getsNum() {
		return sNum;
	}

	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	@Override
	public String toString() {
		return "SAMSUNG [ " + super.toString() + ", 서비스센터 연락처 : " + sNum + " ]";
	}
	
}
