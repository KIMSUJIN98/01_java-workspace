package com.kh.chap01_abstraction.model.vo; 	// vo (Value Object)

/*
 * * 클래스의 구조
 *   public class 클래스명 {
 *   
 *   // 필드부
 *    
 *   // 생성자부
 *    
 *   //메소드부
 *   public void  method1(){
 *   
 *   
 *   }
 *   
 *    
 *    
 *    
 *   }
 * 
 */

/*
public class Student { // 학생을 추상화해서 만든 클래스 (완벽한 상태는 아님)
	
	// 필드부
	// 접근제한자 자료형 변수명		// 접근제한자 [예약어] 자료형 변수명 : 예약어는 생략 가능
	
	// * 접근제한자 : 여기에 접근할 수 있는 범위를 제한하는 것
	//				public > protected > default > private
	
	public String name; // 이름
	public int age; // 나이
	public double height; // 키
	
	
}
*/



// 객체 배열을 이용한 방법 (22.11.08.추가)
public class Student {
	
	// 필드부
	private String name; 	// 이름
	private int age; 		// 나이
	private double height;	// 키
	
	// 생성자부
	// 기본생성자
	public Student() {}
	
	// 매개변수 3개짜리 생성자
	public Student(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// 메소드부
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// 모든 필드 한 문자열로 합친 후 반환시켜주는 information 메소드
	public String information() {
		return name + "님의 나이는 " + age + "살이고, 키는 " + height + "cm 입니다.";
	}

}