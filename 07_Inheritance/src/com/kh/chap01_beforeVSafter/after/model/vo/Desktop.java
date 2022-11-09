package com.kh.chap01_beforeVSafter.after.model.vo;
//			  자식	  ----->	부모
//			  후손	 			조상
//			  하위	 			상위
// 			  this				super
public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// brand ~ price 네 개의 값들은 부모클래스(Product)의 필드에 대입
		// super. 으로 부모에 접근
		
		// 해결방법1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정
		
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2. 부모클래스에 있는 setter 메소드 활용하기 (public 이기 때문에 접근 가능)
		
		/*
		super.setBrand(brand); //this.brand = brand;
		super.setpCode(pCode); //this.pCode = pCode;
		super.setpName(pName); //this.pName = pName;
		super.setPrice(price); //this.price = price;
		*/
		
		// 해결방법3. 부모생성자 호출하기
		super(brand, pCode, pName, price);  		// this() 메소드와 유사하게 상단에 위치해야함.
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	public String information() { 							// 자식 클래스의 information : 부모와 자식클래스 모두 공통의 메소드를 가지고 있을 때, 자식에게 우선순위가 주어진다.(d.information() 출력시 자식클래스의 information이 호출됨)
		return super.information() + ", allInOne : " + allInOne;
	}
	
}
