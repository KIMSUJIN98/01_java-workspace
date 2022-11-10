package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle {
	private int tire;
	
	public Car() {}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	@Override			// 생략은 가능하지만 오타방지를 위해 사용
	public String information() {
		return super.information() + ", tire : " + tire;
	}
	
	@Override // @ : 어노테이션(생략가능)
	public void howToMove() { // 이름을 이상하게 하면 오류남
		System.out.println("바퀴를 굴려 움직인다.");
	}

	@Override 						// 자동완성시 @Override가 나왔던 이유는
	public String toString() { 		// .toString이 자식클래스에 선언됨으로써 객체 클래스에 있는 .toString이 객체의 주소값을 출력하는것이 아니라 자식 클래스에 있는 .toString을 가리키며 안의 정보를 출력하게 되었다.
		return "Car [tire=" + tire + "]";
	}
	
}
