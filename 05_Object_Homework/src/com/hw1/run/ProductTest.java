package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// 매개변수 생성자를 이용하여 3개의 객체 생성
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960_000, 10.0);
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780_000, 0.7);
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250_000, 0.3);
		
		// 객체가 가진 필드 값 출력 확인
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("============================================================");
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		p1.setPrice(1_200_000);
		p1.setTax(0.05);
		
		p2.setPrice(1_200_000);
		p2.setTax(0.05);
		
		p3.setPrice(1_200_000);
		p3.setTax(0.05);
		
		// 객체가 가진 필드 값 출력 확인
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("============================================================");
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// ** 실제가격 = 가격 + (가격 * 부가세율)
		System.out.println("상품명 : " + p1.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(p1.getPrice() + (p1.getPrice() * p1.getTax())) + "원");
		System.out.println("상품명 : " + p2.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(p2.getPrice() + (p2.getPrice() * p2.getTax())) + "원");
		System.out.println("상품명 : " + p3.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(p3.getPrice() + (p3.getPrice() * p3.getTax())) + "원");
	
		/*
		// 금액 바꾸고 해보겠다..번외
		p1.setPrice(p1.getPrice() + (int)(p1.getPrice() * p1.getTax())); 	// Price는 int, Tax는 double이므로 뒷부분 연산결과는 double이 된다.
		System.out.println("부가세 포함 가격 : " + p1.getPrice() + "원");			// 따라서 Price로 받을 수 없으므로 뒷부분만 int형으로 강제 형변환 시킨다.
		p2.setPrice(p2.getPrice() + (int)(p2.getPrice() * p2.getTax()));
		System.out.println("부가세 포함 가격 : " + p2.getPrice() + "원");
		p3.setPrice(p3.getPrice() + (int)(p3.getPrice() * p3.getTax()));
		System.out.println("부가세 포함 가격 : " + p3.getPrice() + "원");
		*/
	}

}
