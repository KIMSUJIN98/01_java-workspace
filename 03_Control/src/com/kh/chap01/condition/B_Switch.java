package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * * switch문도 if문과 동일하게 조건문임!!
	 * 
	 * 	 다만, if문과의 차이점 이라면?
	 * 	 > if문은 조건식을 자유롭게 기술 가능!!
	 * 	 > switch문은 동등비교로 밖에 수행되지 않음!!
	 * 
	 * 	 > 실행할 구문만 실행하고 자동으로 빠져나오질 못함!! (직접 break;문 작성해야됨)
	 * 
	 * 	 [표현법]
	 * 	 switch(이제부터 동등비교할 대상){
	 * 	 case 값1 : 실행코드1 ; break;
	 * 	 case 값2 : 실행코드1 ; break;
	 * 	 ....
	 * 	 [default : 위의 값들과 모두 일치하지 않을경우 실행할 코드;] => if문에서 else와 같은 존재(생략 가능)
	 * 	 
	 * 	 
	 * 	 }
	 * 
	 */
	
	public void method1() {
		/*
		 * 정수를 입력 받아 => 정수
		 * 4일 경우 "빨간색 입니다." => case 4 : 빨간색입니다;
		 * 2일 경우 "파란색 입니다." => case 2 : 파란색입니다;
		 * 3일 경우 "초록색 입니다." => case 3 : 초록색입니다;
		 * 
		 * 잘못 입력했을 경우 "잘못 입력하였습니다." => default
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(1~3) : ");
		int num = sc.nextInt();
		/*
		if (num == 1) {
			System.out.println("빨간색 입니다.");
		}else if (num == 2) {
			System.out.println("파란색 입니다.");
		}else if (num == 3) {
			System.out.println("초록색 입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
		// switch문으로 바꿔보자~~~
		switch(num) {
		case 1 :
			System.out.println("빨간색 입니다."); // 한줄로 써도 되지만, 실무에선 가독성을 위해 개행함.
			break;
		case 2 :
			System.out.println("파란색 입니다.");
			break;
		case 3 :
			System.out.println("초록색 입니다.");
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
			break; // 생략 가능하나, 쓰는 것을 추천함.
		}
	}
	
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		int price = 0; // 항상 초기화하는 습관 필요
		
		switch(fruit) {
		case "사과" : // [case 값 :]의 문법이므로 .equals 불필요하다 
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		case "복숭아" :
			price = 3000;
			break;
		default :
			System.out.println("해당과일은 품절입니다.");
			return; // 해당 메소드 자체를 빠져나가는 구문
		}
		
		// xx의 가격은 xxx원 입니다.
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}

}
