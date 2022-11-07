package com.kh.chap06_method.controller;

public class OverloadingTest { // Overloading은 보통 한단어로 취급하여 카멜표기법을 적용하지 않는다
	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	/*
	 * 같은 메소드명 사용이 불가하다.
	public void test() {
		System.out.println("차은우");
	}
	*/
	
	public void test() {
		System.out.println("주지훈");
	}
	
	public void test(int a) { 		// 매개변수가 다르니 같은 메소드명이여도 사용이 가능하다. 왜냐하면 이 메소드 같은 경우 int 값을 받지 않으면 실행 자체가 불가하기 때문이다.

	}
	
	public void test(int a, String s) { 		// 매개변수가 다르니 같은 메소드명이여도 사용이 가능하다.
		
	}
	
	/*
	 * 오버로딩의 에러부분 찾는거 시험 출제!! (28번 라인에서 에러가 발생한다)
	 * 
	public void test(int c, String d) { 		// 매개변수의 이름이 달라도 형태(매개변수 자료형의 형태, 순서)가 위와 같기에 사용이 불가하다.
		
	}
	* 오버로딩이 가능하려면 매개변수명이 아니라
	* 매개변수의 개수와 순서가 다르게 작성돼야함.
	*/
	
	public void test(String s, int a) { 		// 매개변수의 자료형 종류는 같으나 순서가 다르기에 사용이 가능하다.
		
	}
	
	public void test(int a, int b) {
		
	}
	
	public void test(String str) {
		
	}
	
	/*
	public int test(String str) {
		
	}
	* 반환형 이랑도 상관 없음!!
	* 무조건 매개변수가 달라야한다!!
	*/
	
	/*
	private void test(String str) {
		
	}
	* 접근제한자랑도 상관 없음!!
	* 무조건!! 매개변수가 달라야 한다.
	*/
	
	/*
	 * * 결론
	 *	오버로딩 : 한 클래스 내에 동일한 이름의 메소드들			// 오버로딩과 오버라이딩의 차이점을 서술하시오(면접질문)
	 *			단, 매개변수명, 접근제한자, 반환형을 다 떠나서
	 * 			***** 매개변수의 자료형과 개수, 순서가 다르게 작성돼있어야함!
	 * 			단, return값은 같아도 된다!!
	 */

}
