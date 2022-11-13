package com.kh.chap01_poly.practice02_electronic.run;

import com.kh.chap01_poly.practice02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.practice02_electronic.model.vo.Apple;
import com.kh.chap01_poly.practice02_electronic.model.vo.Lg;
import com.kh.chap01_poly.practice02_electronic.model.vo.Samsung;

public class ElectronicRun {
	
	public static void main(String[] args) {
		
		ElectronicShop1 es = new ElectronicShop1();
		
		es.insert(new Samsung("Z-Flip", "22년 07월 출시", 1_750_000, "1577-1234"));
		es.insert(new Lg("LG gram", "23년 01월 출시 예정", 1_980_000, "스마트폰 사업은 종료"));
		es.insert(new Apple("I-phone12 pro max", "21년 05월 출시", 1_350_000, "iOS 16 지원"));
		
		System.out.println(es.select(0));
		System.out.println(es.select(1));
		System.out.println(es.select(2));
	}

}
