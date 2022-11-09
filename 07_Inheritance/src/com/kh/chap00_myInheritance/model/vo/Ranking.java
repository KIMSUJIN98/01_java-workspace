package com.kh.chap00_myInheritance.model.vo;

public class Ranking extends Kbo { // 클래스 시작

	// 필드부
	private String rank;		// 순위(1위, 2위, 3위, ...)
	
	// 생성자부
	// 기본생성자
	public Ranking() {}
	
	// 매개변수 생성자
	public Ranking(String teamName, int total, int win, int draw, int lose, String rank) {
		super(teamName, total, win, draw, lose);
		this.rank = rank;
	}
	
	// 메소드부
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	// 오버라이딩
	public String information() {
		return super.information() + "/ 순위 : " + rank;
	}
	
	
} // 클래스 끝
