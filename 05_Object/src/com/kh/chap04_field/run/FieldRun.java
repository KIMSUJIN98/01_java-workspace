package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {

		/*
		// ----- FieldTest1 -----
		FieldTest1 f1 = new FieldTest1();
		f1.test1(10);
		*/
		
		
		/*
		// ----- FieldTest2 -----
		FieldTest2 f2 = new FieldTest2();
		
		//public
		System.out.println(f2.pub);
		
		//protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속 구조에서만 접근 가능
		//System.out.println(f2.pro);
		
		//default : 오로지 같은 패키지 내에서만 접근 가능!! 다른 패키지 절대불가!!
		//System.out.println(f2.def);
		
		//private : only 해당 클래스에서만 접근 가능!!
		//System.out.println(f2.pri);
		*/
		
		
		// ----- FieldTest3 -----
		System.out.println(FieldTest2.sta); // 클래스명이 들어가야 한다 : sta라는 값이 다른 클래스에서 사용될 수도 있기 때문이다. (sta 값이 한번만 쓰였더라도 자바는 알지 못하므로 에러 발생)
		System.out.println(FieldTest3.sta);
		
		// 수정하고 싶다면?
		FieldTest3.sta = "ㅋㅋㅋㅋㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		// 근데 절대 변경 안되게 하고싶다면? => 상수필드로 선언해야함
		System.out.println(FieldTest3.STA_FIN);
		// FieldTest3.STA_FIN = "ㅎㅎㅎㅎㅎㅎ"; => 변경이 불가
		
		System.out.println(Math.PI);
		// Math.PI = 2.999; => 변경이 불가
		
		int random = (int)(Math.random()); // 기울임 : static	 // Math.random도 static이므로 랜덤함수 생성시 별도의 new 선언이 필요없었다.
		
		
	}

}
