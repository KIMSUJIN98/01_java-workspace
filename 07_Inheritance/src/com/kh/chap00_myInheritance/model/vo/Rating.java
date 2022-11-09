package com.kh.chap00_myInheritance.model.vo;

public class Rating extends Kbo { // 클래스 시작
	
	// 필드부
	private double rate;	// 승률
	
	// 생성자부
	// 기본생성자
	public Rating() {}

	// 매개변수 생성자
	public Rating(String teamName, int total, int win, int draw, int lose, double rate) {
		super(teamName, total, win, draw, lose);
		this.rate = rate;
	}
	
	// 메소드부
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	// 오버라이딩
	public String information() {
		return super.information() + "/ 승률 : " + rate;
	}
	
} // 클래스 끝
