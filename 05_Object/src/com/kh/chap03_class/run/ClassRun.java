package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

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
		
		System.out.println();
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println();
		System.out.println(p.information());
		
		
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		
		// 첫번째 방법 : 기본생성자로 생성 후 setter 메소드 이용해서 값 초기화
		/*
		Product p1 = new Product(); // new를 만나면 Heap영역에 필드 갯수만큼 방이 생긴다
		p1.setpName("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		*/
		
		/*
		Product p2 = new Product();
		p2.setpName("아이폰");
		p2.setPrice(1_300_000);
		p2.setBrand("애플");
		*/
		
		
		// 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		Product p1 = new Product("갤럭시", 1200000, "삼성");
		p1.setPrice(1000000); // 일부분 수정을 위해 세터, 게터가 필요하다
		
		Product p2 = new Product("아이폰", 1_300_000, "애플");

		
		//pName : xxx, price : xxxx, brand : xxxx
		System.out.print("pName : " + p1.getpName() + ", ");
		System.out.print("price : " + p1.getPrice() + ", ");
		System.out.println("brand : " + p1.getBrand());
		
		System.out.print("pName : " + p2.getpName() + ", ");
		System.out.print("price : " + p2.getPrice() + ", ");
		System.out.println("brand : " + p2.getBrand());
		
		System.out.println();
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println();
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		System.out.println();
		System.out.println("=== 생성자 만들고 난 후 ===");
		System.out.println();
		Person per = new Person();
		System.out.println(per.information());
		System.out.println();
		Person per1 = new Person("김수진", "pwd11", 25, "010-5555-5555");
		System.out.println(per1.information1());
		Person per2 = new Person("user22", "pwd22", "김수진", 26, 'M', "010-3210-6543", "xxx@naver.com");
		System.out.println(per2.information());

	}

}
