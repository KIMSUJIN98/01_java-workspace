package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public interface Basic {

	// 추상클래스(abstract class) : 일반필드 + 일반메소드 [+ 추상메소드]
	// 인터페이스(interface)      : only 상수필드 + 추상메소드
	
	//private int a; 						// 불가
	
	/*
	public void test() {					// 불가
		
	}
	*/
	
	// 인터페이스에서 필드는 무조건 상수 필드임!!!
	/*public static final*/ int NUM = 10;		// interface 에서는 생략가능
	
	// 인터페이스에서 메소드는 무조건 추상메소드임!!
	/*public abstract*/ void eat();				// 추상메소드는 머리부만 작성하므로 {} 작성 안함.
	public abstract void sleep();

}
