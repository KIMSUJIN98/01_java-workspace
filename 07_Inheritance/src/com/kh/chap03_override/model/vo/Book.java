package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	// information 안만들어요
	
	/*
	 * * 오버라이딩
	 * - 자식클래스가 상속받고 있는 부모클래스의 메소드를 재정의(재작성) 하는 것
	 * - 부모가 제공하는 메소드 자식이 일부 고쳐서 사용하겠다는 의미
	 * - 자식객체를 통해 실행시 자식메소드가 우선권을 가짐
	 * 
	 * * 오버라이딩 성립 조건
	 * - 부모메소드명 동일
	 * - 매개변수개수, 자료형, 순서 동일(매개변수 명은 상관 없다)
	 * - 부모메소드의 반환형 동일
	 * - 부모메소드의 접근제한자보다 범위가 같거나 커야한다.
	 * ex) 부모메소드의 접근제한자가 protected 일 경우 오버라이딩 하는 메소드의 접근제한자 protected, public
	 * => 규약의 개념이 들어가 있다.(너가 재정의 할꺼면 이정도의 규칙은 지켜줘라.....)
	 * 
	 * @Override 어노테이션
	 * - 생략가능함, 크게상관없음 (명시하지 않아도 오버라이딩 된 상태)
	 * - 어노테이션 붙이는 이유
	 * >> 부모메소드 명이나 매개변수가 수정될 경우 => 알아보기 쉽다.
	 * 	  자식메소드 기술시 오타가 있을 경우 => 알아보기 쉽다.
	 * >> 단지 이 메소드 오버라이딩한 메소드다 라고 알려줌
	 */
	
	
	/*
	@Override 								// 별도의 선언이 없으나 오류가 안나는 이유 : 부모클래스인 Object클래스가 toString을 가지고 있기 때문이다.
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	*/

}
