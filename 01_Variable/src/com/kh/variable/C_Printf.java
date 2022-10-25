package com.kh.variable;

public class C_Printf {
	
	public void printfTest() {
		
		//System.out.print(출력하고자 하는 값); // 출력만 함 (줄바꿈 발생x)
		//System.out.println(출력하고자 하는 값); // 출력 후 줄바꿈 발생o
		
		//System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값);
		//출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 (줄바꿈 발생x - 한줄 띄어쓰기 안됨!!)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열(문자)
		 * %f : 실수
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		//10 20
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d", iNum1, iNum2);
		System.out.println();
		
		//10 20%
		System.out.printf("%d %d%%", iNum1, iNum2);
		System.out.println();
		//System.out.printf("%d %d", iNum1); : 이건 오류남
		//System.out.printf("%d %d", iNum1, iNum2, 30); : 이건 오류는 안남. 그 이후값 무시
		
		System.out.printf("%5d\n", iNum1); // 양수 5 오른쪽 정렬
		System.out.printf("%-5d\n", iNum1); // 음수 5 왼쪽 정렬
		
		// 정렬하고자 할 때 사용한다
		// 양수 5 오른쪽 정렬
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		double dNum1 = 1.23456789; // 무조건 소숫점 아래 6째자리까지 보여줌
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f\n", dNum1, dNum2); // \n 개행, \t 탭만큼 띄어쓰기
		System.out.printf("%.2f %.2f\n", dNum1, dNum2); // %뒤에 .n을 붙여주면 n번째 자리까지 소숫점 표현
		
		char ch = 'a';
		String str = "Hello";
		
		// 소문자 출력
		System.out.printf("%c %s %s\n", ch, str, ch);
		// 대문자 출력
		System.out.printf("%C %S %S\n", ch, str, ch);
		
	}

}
