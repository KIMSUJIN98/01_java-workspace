package com.kh.chap00_myInheritance.model.vo;

public class Pizza extends Food {
	// 필드부
	private boolean cheeseCrust; // 치즈크러스트 유무
	
	// 생성자
	public Pizza() {}

	public Pizza(String fName, int price, String category, double starScore, boolean cheeseCrust) {
		super(fName, price, category, starScore);
		this.cheeseCrust = cheeseCrust;
	}

	public boolean isCheeseCrust() {
		return cheeseCrust;
	}

	public void setCheeseCrust(boolean cheeseCrust) {
		this.cheeseCrust = cheeseCrust;
	}
	
	public String information() {
		return super.information() + ", 치즈크러스트 여부 : " + cheeseCrust;
	}
	
	
	

}
