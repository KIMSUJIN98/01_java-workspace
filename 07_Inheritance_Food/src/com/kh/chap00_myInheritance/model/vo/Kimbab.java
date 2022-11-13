package com.kh.chap00_myInheritance.model.vo;

public class Kimbab extends Food {
	
	//필드 선언
	private boolean takeOut; // 포장 여부
	
	// 생성자
	public Kimbab() {}
	
	public Kimbab(String fName, int price, String category, double starScore, boolean takeOut) {
		super(fName, price, category, starScore);
		this.takeOut = takeOut;
	}

	public boolean isTakeOut() {
		return takeOut;
	}

	public void setTakeOut(boolean takeOut) {
		this.takeOut = takeOut;
	}
	
	public String information() {
		return super.information() + ", 포장여부 : " + takeOut;
	}

}
