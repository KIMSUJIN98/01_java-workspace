package com.kh.homework.run;

import com.kh.homework.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		Product p = new Product();
		
		p.setpName("신라면");
		p.setPrice(1000);
		p.setBrand("농심");
		
		System.out.println("상품의 이름 : " + p.getpName());
		System.out.println("상품의 가격 : " + p.getPrice() + "원");
		System.out.println("상품의 브랜드 : " + p.getBrand());
	}

}
