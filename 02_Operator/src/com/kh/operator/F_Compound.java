package com.kh.operator;

public class F_Compound {
	
	/*
	 *	*복합 대입 연산자
	 *	 산술연산자와 대입연산자가 결합돼있는 형태 (산술연산 먼저쓰고 대입연산 나중)
	 *	 연산처리 속도가 빨라지므로 사용하는걸 권장함!!!
	 *
	 *	 += -= *= /= %=
	 *
	 *	 a = a + 3;		=> a += 3; // a=10일 경우 a=13으로 초기화
	 *	 a = a - 3;		=> a -= 3;
	 *	 a = a * 3;		=> a *= 3;
	 *	 a = a / 3;		=> a /= 3;
	 *	 a = a % 3;		=> a %= 3;
	 */
	
	public void method1() {
		int num = 12;
		System.out.println("최초 num : " + num); // 12
		
		//int num = num; no effect : 아무런 쓸모없는 코드(num = num;), 자료형을 넣어주면 변수를 다시 선언하는 것임으로 오롯이 변수명만 작성하도록 함.
		num = num + 3;
		System.out.println("3 증가 시킨 num : " + num); // 15
		
		num += 3;
		System.out.println("3 증가 시킨 num : " + num); // 18
		
		num -= 5; // num = num -5;
		System.out.println("5 감소 시킨 num : " + num); // 13
		
		num *= 6; // num = num * 6;
		System.out.println("6배 증가시킨 num : " + num); // 78
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num); // 39
		
		num %= 4;
		System.out.println("최종 num : " + num); // 3
		
		String str = "Hello";
		//str = str + "World!!";
		str += "World!!";
		System.out.println(str);
		
	}

}
