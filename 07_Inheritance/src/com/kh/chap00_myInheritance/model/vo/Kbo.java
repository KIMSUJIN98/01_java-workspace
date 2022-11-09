package com.kh.chap00_myInheritance.model.vo;

public class Kbo { // 클래스 시작
	
	// 필드부
	private String teamName; 	// 팀명
	private int total;			// 전체 경기수
	private int win;			// 승리
	private int draw;			// 무승부
	private int lose;			// 패배
	
	// 생성자부
	// 기본생성자
	public Kbo() {}
	
	// 매개변수 생성자
	public Kbo(String teamName, int total, int win, int draw, int lose) {
		this.teamName = teamName;
		this.total = total;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}
	
	// 메소드부
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public String information() {
		return "KBO 구단명 : " + teamName + "/ 총 경기수 : " + total + "/ 승리 : " + win + "/ 무승부 : " + draw + "/ 패배 : " + lose;
	}
	

} // 클래스 끝
