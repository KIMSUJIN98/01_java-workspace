package com.kh.variable;

import java.util.Scanner;

public class D_Casting {
	
	/*
	 * * 형변환 : 값의 자료형을 바꾸는 것
	 * 
	 * * 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
	 *  1. 대입연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 한다!!
	 *  => 즉, 같은 자료형에 해당하는 값만 대입 가능!!
	 *  => 즉, 다른 자료형의 값을 대입하고자 한다면 형 변환이 필수이다!!
	 *  
	 *  자료형 변수명 = (자료형)값;
	 *  
	 *  2. 같은 자료형 끼리만 연산이 가능
	 *  
	 *  값 + 값 => 계산 결과도 같은 자료형으로 나온다.
	 *  
	 * * 형변환 종류
	 *  1. 자동 형변환 => 자동으로 형변환이 이뤄져서 우리가 형변환을 시킬 필요가없음!!
	 *  2. 강제(명시적) 형변환 => 자동 형변환이 안돼서 우리가 직접 형변환을 해줘야함.
	 * 
	 * [표현법] 자료형 변수명 = (바꿀 자료형) 값;
	 * 
	 * * 주의사항
	 * boolean 은 형변환이 불가능
	 */
	
	public void autoCasting() {
		/* 
		 * 자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형간의 연산시
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환후 처리해줌
		 */
		
		//1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1;
		
		System.out.println("d1 : " + d1); // 12.0
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2 + d2; //12.0 + 3.3 => 15.3
		System.out.println("result : " + result);
		
		
		// 2. int(4byte) => long(8byte)
		
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f; //float형 변수는 숫자 옆에 f를 붙여줘야한다. f를 붙이지 않은 실수는 double 형으로 인식하므로 자료형이 맞이 않아 에러 발생.
		double d4 = /*(double)*/f4;
		
		
		// == 특이케이스 ==
		// 4. long(8byte) => float(4byte) 실수형
		// float형이 실수형이기 때문에 long형 보다 표현 가능한 수의 범위가 더 커서
		// 자동 형변환이 된다.
		long l5 = 10000000L; // long형도 마찬가지로 l을 붙이는 특성이 있는데, 1과 구분짓고자 대문자 L을 붙여준다.
		float f5 = /*(float)*/l5;
		
		
		// 5. char(2byte) <=> int(4byte)
		int num = 'C'; //아스키코드(+유니코드)
		System.out.println("num : " + num);
		
		char ch = 55153; //아스키코드(+유니코드)
		System.out.println("ch : " + ch);
		
		// 각 문자들마다 고유한 숫자가 지정되어 있기 때문에
		// 쌍방향으로 형변환 가능
		// char변수는 음수값 저장 불가!!!!!
		// => 값의 범위 0~65535
		
		// 6. byte 또는 short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		// byte b3 = b1 + b2; // byte나 short는 연산시 무조건 int형으로 처리함.
							  // 연산 결과가 범위가 더 큰 int형임 => byte형 대입 불가
		
		byte b3 = (byte)(b1 + b2); // (byte) b1 + b2; 는 b1만 바이트 처리되어 에러 발생.
		System.out.println("b3 : " + b3);
		
	}
	
	public void forceCasting() {
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		
		// double(8byte) => float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		// 강제형변환 안해주면 오류난다. 명시적으로 형변환 해줘야함
		
		// double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum; // 덧셈연산시 자동 형변환이 된다. => 더블형
									// 연산결과인 double형이 int형에 대입 불가
		
		// 에러 해결 방법
		// 방법1. 연산결과를 int형으로 강제 형변환
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : " + iSum1); // 15
		// 형변환 통해서 정수값만 출력된다. 데이터 손실 발생
		
		// 방법2. double형 값 만을 int형으로 강제형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2); // 15
		// 실수 값을 정수형으로 강제형변환시 소숫점 아래 부분 버려짐
		// => 데이터 손실 발생할 수 있음
		
		// 방법3. 연산결과를 아싸리 double 변수에 대입
		double iSum3 = iNum + dNum;
		System.out.println("iSum3 : " + iSum3); // 15.89
		
		// 데이터 손실 테스트
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		System.out.println("bNum2 : " + bNum2); // 34
		// 바이트의 범위 초과됨: -128~127
		
	}
	
	/*
	 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아서 총점과 평균을 계산해서 출력해라
	 * 메소드 이름 : calScore()
	 * 
	 * 총점과 평균은 정수형으로 처리함
	 * 
	 * 입력 예
	 * 국어 : 91.3
	 * 영어 : 88.7
	 * 수학 : 55.0
	 * 
	 * 출력 예
	 * 총점 : 235
	 * 평균 : 78
	 */
	
	public void calScore() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(kor + eng + math));
		System.out.println("평균 : " + (int)((kor + eng + math)/3));
		
		sc.close();
		
	}

}
