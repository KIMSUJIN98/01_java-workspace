package com.kh.chap00_myInheritance.model.vo;

public class PostSeason extends Kbo { // 클래스 시작
	
	// 필드부
	private boolean pass; 		// 포스트시즌 진출여부
	
	// 생성자부
	// 기본생성자
	public PostSeason(){}
	
	// 매개변수 생성자
	public PostSeason(String teamName, int total, int win, int draw, int lose, boolean pass) {
		super(teamName, total, win, draw, lose);
		this.pass = pass;
	}
	
	// 메소드부
	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}

	// 오버라이딩
	public String information() {
		return super.information() + "/ 포스트시즌 진출 : " + pass;
	}
	
} // 클래스 끝
