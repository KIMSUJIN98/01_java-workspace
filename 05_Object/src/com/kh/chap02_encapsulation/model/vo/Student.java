package com.kh.chap02_encapsulation.model.vo;

public class Student { // 나만의 자료형
	
	// 필드부 선언
	// 접근제한자 자료형 변수명
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	
	// 생성부 선언 : 관례적으로 기본생성자부터 매개변수가 적은 순으로 작성해야 한다.
	// 기본생성자
	public Student() {
		System.out.println("Student 객체가 생성됐습니다.");
	}
	
	
	// 생성자(이름, 키, 국어점수)만을 받는 매개변수 생성자
	public Student(String name, double height, int korScore) {
		this.name = name;
		this.height = height;
		this.korScore = korScore;
	}
	
	
	// 생성자(전체필드) 생성자
	public Student(String name, int age, double height, int korScore, int mathScore) {
		this(name, height, korScore);
		/*
		 * 중복된 내용은 this() 생성자를 활용하여 처리한다
		this.name = name;
		this.height = height;
		this.korScore = korScore;
		*/
		this.age = age;
		this.mathScore = mathScore;
	}
	
	
	
	// 메소드부 선언
	
	/*
	 * * 메소드
	 * [표현법]
	 * 접근제한자 반환형 메소드명([매개변수]) {
	 * 		.. 실행할 코드
	 * 
	 * }
	 * 
	 */
	
	/*
	public void method1(int a) { // 매개변수 : 전달되는 변수
		int b = 10; // 일반변수
		
	}
	*/
	
	// - setter 메소드
	// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 기능의 메소드
	
	/*
	public void setName(String newName) {
		//매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수 선언문 (해당 메소드 내에서만 사용 가능)
		name = newName;
	}
	*/
	
	public void setName(String name) { // 관례적인 표현
		//name = name; // 색이 똑같아..
					   // 필드명과 매개변수명이 동일한 시점에서는 해당 메소드 영역에서 만들어진 변수가 우선순위가 더 높음
		// 필드 name = 매개변수 name; 원함
		this.name = name; // 색차이
	}
	
	public void setAge(int age) {
		this.age = age; // 직접접근
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// - getter 메소드
	// 해당 필드에 담긴 값을 반환해주는 역할 수행
	
	public String getName() { // void 아니다. 어떤 자료형을 던져줄지 써줘야함.
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	public String information1() { // 관례적으로 내가 만든 메소드는 제일 아래 부분에 작성해준다.
		return "name : " + name + ", height : " + height + ", korScore : " + korScore;
	}
	
	public String information() {
		return "name : " + name + ", age : " + age + ", height : " + height + ", korScore : " + korScore + ", mathScore : " + mathScore;
	}

}
