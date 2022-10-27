package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * 반복문
	 * 프로그램 흐름은 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문(do-while문))
	 * 
	 * * for문
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식) { // 반복 횟수를 지정하기 위해 제시하는 것들
	 * 		반복적으로 실행시키고자 하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴 
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용함)
	 * 
	 * * for문을 만나는 순간
	 * 초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * ------------------이 내용이 계속 반복-----------------------
	 * 		--> 조건식 검사 --> false일 경우 실행구문 실행하지않고 --> 반복문 빠져나옴
	 * 
	 * * 알아둘 것
	 * for문안에 초기식, 조건식, 증감식 각각 생략가능하긴함 (단 ; ; 은 반드시 필수)
	 * 안에 내용 아무것도 없고 ;;만 있으면 무한 실행됨.
	 */
	
	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력하기
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		for(int i =1; i<=20 ; i++) { // i값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행(1,2,3,4,5 => 5회 수행)
			System.out.println("안녕하세요");
		}
		
		for(int i = 0; i<=4; i++ ) { // i값이 0에서부터 4까지 매번 1씩 증가하는 동안 반복 수행(0,1,2,3,4 => 5회 수행)
			System.out.println("반갑습니다.");
		}
		
		for(int i = 11; i<=15; i++) { // i값이 11에서부터 15까지 매번 1씩 증가하는 동안 반복 수행(11,12,13,14,15 => 5회 수행)
			System.out.println("저리가세요"); //5번
		}
		
		for(int i =1; i<=9; i+=2) { // i값이 1에서부터 9까지 매번 2씩 증가하는 동안 반복 수행(1,3,5,7,9 => 5회 수행)
			System.out.println("Hello"); //5번 수행
		}
		
		//System.out.println(i); : 영역 외에서 출력 안됨.
	}
	
	
	public void method2() {
		// 1부터 5까지 출력
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		/*
		for(int i = 1; i<=5 ;i++) {
			System.out.println(i);
		}
		*/
		
		// 1 2 3 4 5(사이사이 공백을 넣어서)
		for(int i = 1; i<=5; i++) {
			System.out.print(i + " ");
		}
	}
	
	
	public void method3() {
		// 5 4 3 2 1
		for(int i =5; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	
	public void method4() {
		// 1부터 10까지의 홀수만을 출력
		// 1 3 5 7 9
		
		/*
		for(int i =1; i<=9; i+=2) { // i값이 1에서부터 9까지 매번 2씩 증가되는 동안 반복 수행(1,3,5,7,9 => 총 5회)
			System.out.print(i + " ");
		}
		*/
		
		for(int i =1; i<=10; i++) { // i값이 1에서부터 10까지 매번 1씩 증가되는 동안 반복 수행(10회)
			if(i % 2 == 1) { // 조건을 두어 출력 제한
				System.out.print(i + " ");
			}
		}
	}
	
	
	public void method5() {
		// 1 2 3 4 ... 8 9 10 for문 고정
		
		/* 초기 코드
		 * 
		for(int i =0; i<=10; i++) {
			if(i >= 1) {
			System.out.print(i + " ");
			}
		}
		*/
		
		for(int i =0; i<=9; i++) {
			System.out.print((i+1) + " ");
		}
	}
	
	
	public void method6() {
		// 1에서부터 10까지의 총 합계
		
		// 방법1. int sum = 1 + 2 + 3 + .... + 8 + 9 + 10;
		
		// 방법2.
		/*
		 * int sum = 0;
		 * sum += 1; => sum = sum + 1; 0 + 1
		 * sum += 2; => sum = sum + 2; 0 + 1 + 2
		 * sum += 3; => sum = sum + 3; 0 + 1 + 2 + 3
		 * ...
		 * sum += 9;
		 * sum += 10;
		 * 
		 * 규칙을 찾자!!
		 * sum 변수에 누적해서 합산하는거 반복적으로 진행됨
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는걸 파악할 수 있음!!
		 */
		
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum); // 반복문 밖에다가 작성해야됨.
	}
	
	
	public void method7() {
		// 사용자에게 값을 입력받아 1부터 입력받은 수까지의 합계출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		/*
		int sum = 0;
		 
		sum += 1 ;
		sum += 2 ;
		....
		sum += num;
		*/
		
		int sum = 0;
		for(int i =1; i<=num; i++) {
			sum += i;
		}
		// 1부터 n까지의 합 : xxx
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}
	
	
	public void method8() {
		// 1에서부터 어떤 랜덤값(1~10 사이의 랜덤값) 까지의 총 합계
		
		// 자바에서 제공하고 있는 클래스 (Math)
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출해서
		 * 매번 다른 랜덤값을 얻어 낼 수 있음!!
		 * Math.random(); 이런식으로 호출 => 0.0 ~ 0.999999... 사이의 랜덤값 발생
		 * 								(0.0 <=		< 1.0)
		 */
		
		// int random = Math.random(); // double형이라서 안됨
		//				0.0 ~ 1.0	0.0 ~ 0.999999
		//int random = Math.random() * 10;
		//				0.0 ~ 10.0	0.0 ~ 9.99999
		//int random = Math.random()*10 +1;
		//				1.0 ~ 11.0	1.0 ~ 10.99999
		int random = (int)(Math.random()*10 +1);
		//				1 <=	< 11 => 1~10
		System.out.println("1~10 사이의 랜덤값 : " + random);
		
		int sum = 0;
		for(int i =1; i<=random; i++) {
			sum += i;
		}
		// 1부터 n까지의 합계
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}
	
	
	public void method9() {
		String str = "Hello";
		
		// 각 인덱스별 문자를 뽑아서 출력
		/*
		 * H	=> str.charAt(0); 출력
		 * e	=> str.charAt(1); 출력
		 * l	=> str.charAt(2); 출력
		 * l	=> str.charAt(3); 출력
		 * o	=> str.charAt(4); 출력
		 * 
		 * 0번 인덱스부터 4번인덱스(마지막 인덱스) 까지 매번 1씩 증가하면서 반복 수행
		 */
		
		for(int i =0; i<=4; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	
	public void method10() {
		// 사용자에게 문자열 입력 받아서 (str 변수에 대입)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.nextLine();
		
		// 각 인덱스별 문자를 뽑아서 출력
		
		// apple의 길이 : 5글자
		// 01234
		
		// strawberry : 10글자
		// 0123456789
		
		// kiwi : 4글자
		// 0123
		
		// 아하! 마지막 인덱스는 항상 (문자열의 길이 -1) 이구나....
		// 추출하고자 하는 인덱스값이 (문자열의 길이 -1) 까지 매번 1씩 증가
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i =0; i<str.length(); i++) { // i<=str.length()-1 에서 -1을 뺀 것과 같은 효과
			System.out.println(str.charAt(i));
		}
	}
	
	
	public void method11() {
		// 구구단을 출력 : 입사시험에서 손코딩으로 보는 경우 종종 있음
		// 2단 출력하기
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 */
		
		for(int i =1; i<=9; i++) {
			//System.out.println("2 x " + i + " = " + 2 * i);
			System.out.printf("%d x %d = %d\n", 2, i, 2 * i);
		}
	}
	
	
	public void method12() {
		// 사용자에게 단을 입력 받아 구구단 출력
		// int dan;
		// 2~9 사이의 정수를 입력 => 가이드 문구
		// 다른 숫자를 입력했을 경우 : 2~9 사이의 숫자를 입력해야됩니다. 잘못입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int i =1; i<10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}else {
			System.out.println("2~9 사이의 숫자를 입력해야됩니다. 잘못입력하셨습니다.");
			return;
		}
		sc.close();
	}
	
	
	public void method13() {
		// 2부터 9까지의 랜덤값 발생시켜서 랜덤단 출력하기
		int dan = (int)(Math.random() * 8 + 2); // 2가 시작 수, 시작 수로부터 몇개의 랜덤을 발생시킬래?
		//			0.0 <=	< 1.0
		//			0.0 <=	< 8.0  ( x8 )
		//			2.0 <=	< 10.0 ( +2 )
		//			2	<=	< 10 // 2~9
		// 공식 : 곱하는 수 - 범위의 숫자 개수(2,3,4,5,6,7,8,9) / 더하는 수 - 시작 숫자
		System.out.println("=== " + dan + "단 ===");
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}
	
	
	// 중첩 for문
	public void method14() {
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for(int j = 1; j<=3; j++) { // 주로 j를 사용함
			for(int i = 1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	
	public void method15() {
		// ****
		// ****
		// ****
		// ****
		for(int j = 0; j<4; j++) {
			for(int i = 0; i<4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method16() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		// 행 1~4 까지 반복 => 바깥쪽 for문
		// 매 행 고정일때 열은 1~4 까지 반복 => 안쪽 for문
		for(int j = 1; j<=4; j++) {
			for(int i = 1; i<=4; i++) {
				if(j == i) {
					System.out.print(i); //j여도 상관없다
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	public void method17() {
		// 2단부터 9단까지 다 출력
		// === n단 ===
		// 각 단의 출력이 끝나면 개행되도록 한다
		
		for(int dan = 2; dan<=9; dan++) {
			System.out.println("=== " + dan + "단 ===");
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
			System.out.println();
		}
	}
	
	
	public void method18() {
		for(; ;) { // 조건식 자리 생략시 기본적으로 true => 무한반복문!!!!!
			System.out.println("안녕");
		}
	}
	
	
}
