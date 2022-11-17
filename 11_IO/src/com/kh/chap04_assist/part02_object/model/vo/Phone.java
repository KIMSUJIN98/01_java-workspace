package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // 직렬화 						// Serializable은 하나의 인터페이스. Phone이라는 클래스가 스트림을 지나가기엔 용량이 크기에 직렬화를 통해 통과가능한 크기로 만들어주는 과정
	
	// 객체 자체를 입출력 하고자 한다면 직렬화 과정 필수
	
	private String name;
	private int price;
	
	public Phone() {}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	

	
	
	

}
