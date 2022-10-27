package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/*
	 * * do-while문
	 * 
	 * do {
	 * 		반복적으로 실행할 코드(무조건!!! 실행)
	 * }while(조건식);
	 * 
	 * *** 처음에 무조건 실행코드 실행
	 * --> 조건식 검사 --> true일 경우 실행코드 실행
	 * --> 조건식 검사 --> true일 경우 실행코드 실행
	 * --> 조건식 검사 --> false일 경우 실행코드 실행x => 반복문 빠져나감
	 * 
	 * * 기존의 for / while문과의 차이점
	 * 	 for / while 문 같은경우에는 조건 검사 후에 true여야만 수행
	 * 	 근데 do-while문은 조건검사 없이 무조건 한번은 수행!!
	 * 
	 */
	
	public void mothod1() {
		int num = 1;
		do {
			System.out.println("num의 값 : " + num);
		}while(false); // 대놓고 false
		// 조건이 애초에 맞지 않아도 무조건 한 번은 실행함!!
	}
	
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		
		do {
			System.out.print(i + " "); //실행할 코드 자리
			i++;
		}while(i<6);
		// 조건이 true일때는 while문이랑 똑같다
	}
	
	
	public void method3() {
		// 1부터 사용자가 입력한 수 까지의 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i; // 누적합 공식
			i++; // 증감식이 없는경우 무한루프, 조건식을 빠져나올 수 없다
		}while(i<=num);
		
		System.out.println("1부터 " + num + " 까지의 합계 : " + sum);
		sc.close();
	}

}
