package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class ClassRun {

	public static void main(String[] args) {
		
		// 객체 생성 => new
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!		// String - null, char - ' ', int - 0, double - 0.0 으로 초기화
		
		// 셋팅시작 : 관례적으로 필드선언한 순서대로 진행
		p.setId("qwer9402");
		p.setPwd("12345");
		p.setName("김수진");
		p.setAge(25);
		p.setGender('M');
		p.setPhone("010-1234-5678");
		p.setEmail("qwer9402@naver.com");
		
		System.out.println("아이디 : " + p.getId());
		System.out.println("비밀번호 : " + p.getPwd());
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("성별 : " + p.getGender());
		System.out.println("연락처 : " + p.getPhone());
		System.out.println("이메일 : " + p.getEmail());

	}

}
