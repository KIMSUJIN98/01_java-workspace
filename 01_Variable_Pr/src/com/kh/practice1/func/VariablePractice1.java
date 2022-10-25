package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void inputTest1() {
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// sc.nextLine(); : 밑에 sc.nextLine()을 사용하는 경우에만 추가해준다.
		// 다음의 상황은 아래가 nextDouble()이므로 굳이 필요하지 않다.
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다 ^^");
		
		sc.close();
		
	}

}
