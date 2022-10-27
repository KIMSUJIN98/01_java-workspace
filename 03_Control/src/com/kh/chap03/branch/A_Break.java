package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break;	: 반복문 안에 사용되는 분기문
	 * 			  break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 * 
	 * * 유의 사항 : switch문 안의 break;는 단지 switch문 만을 빠져나가는 구문
	 */
	
	public void method1() {
		
		// 랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이과정 반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우(3으로 나눴을 때 나머지가 0일경우) 반복문을 빠져나와보자
		
		while(true) { //무한 반복 시키고
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("random 값 : " + random);
			
			if(random % 3 == 0) { // 3의 배수일 경우
				break; // 반복문을 강제로 빠져나가게 하는 구문
			}
		}
	}
	
	
	public void method2() {
		// 사용자에게 문자열 입력 받아 해당 그 문자열의 길이 출력(무한반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문 빠져나와보자
		// String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 무한반복
			System.out.print("문자열 입력해주세요 : ");
			String str = sc.nextLine();
			
			String exit = "exit";
			
			if(str.equals(exit)) { //str.equals("exit")가능 : String형은 == 동등비교 불가!
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("문자열의 길이 : " + str.length()); // break;문은 반복문인 while문 자체를 빠져나가기에 else문에 안써줘도 됨.
			}
		}
		sc.close();
	}
	
	
	public void method3() { // 중요 메소드
		// 사용자에게 단(2~9)을 입력 받아 해당 단을 출력 (무한로딩)
		// 혹시라도 잘못된 단을 입력했을 경우 다시 단을 입력 받도록 유도
		// 잘 입력받은 경우 해당 단을 출력하고 프로그램 종료
		// 단(2~9)을 입력해주세요 : 
		// 20단 : 잘못입력했습니다. 다시 입력해주세요.
		// while문 / 구구단 : for문도 가능
		
		/* 강사님 코드
		Scanner sc = new Scanner(System.in);
		
		while(true) { // for(; ;)도 가능하나 잘 안씀.
			System.out.print("단(2~9)을 입력해주세요 : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <=9) { // 잘 입력했을 경우 => 해당 단을 출력 후 프로그램 종료
				for(int i =1; i<=9; i++) {
					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				}
				break;
			}else { // 잘못입력했을 경우 => 잘못입력했음을 알리는 문구 출력
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			}
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("단(2~9)을 입력해주세요 : ");
			int dan = sc.nextInt();
			
			if(dan<2 || dan>9) { 
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			}else {
				for(int i =1; i<10; i++) {
					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				}
				break; // break;문이 for문 안으로 들어가게되면 "dan x 1 = dan"만 출력하고 메소드 종료되버림.
			}
		}
	}


}
