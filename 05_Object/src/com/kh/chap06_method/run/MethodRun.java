package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		/*
		// ----- NonStaticMethod -----
		NonStaticMethod n = new NonStaticMethod(); // JVM이 기본생성자를 자동으로 만들어 준다.
		
		// 1. 매개변수도 없고 반환값도 없는 메소드 호출
		n.method1();
		//n.method1(10); 	// 반환값이 없으므로 불가능
		
		// 2. 매개변수 없고 반환값은 있는 메소드
		//n.method2(); 		// return 부분이 출력되지 않는다 => return은 sysout과 달리 출력하지 않고 값을 던지고 끝난다
		//int str = n.method2(); 	// return과 자료형을 맞춰줘야 한다.
		
		//String str = n.method2(); 	// method2를 호출하면서 "매개변수는 없고 반환값은 있는 메소드 입니다."가 출력되고 return 값이 str에 담긴다.
		//System.out.println(str); 		// str 값인 "아.. 집에 가고 싶다."가 출력된다.
		
		System.out.println(n.method2()); 	// 한번에 출력 가능하다
		
		// 3. 매개변수는 있고 반환값은 없는 메소드
		//n.method3(3); 	// 불가능 : 매개변수와 갯수가 일치해야한다
		//int a = n.method3(10, 20); 		// 불가능 : return 결과값이 없으므로 변수 a에 담을 값이 없다
		n.method3(10, 5);
		n.method3(10, 0);
		
		// 4. 매개변수도 있고 반환값도 있는 메소드
		
		//char ch = n.method4("lemon", 1);
		//System.out.println(ch);
		
		System.out.println(n.method4("lemon", 1)); 	// 한번에 출력 가능하다
		
		// 사용자에게 매개변수를 입력 받아서 해당 메소드(메소드 4) 호출
		// index값이 범위를 벗어나는 경우 공백을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("index 값 입력 : ");
		int index = sc.nextInt();
		
		// 여기서 유효성 검사 해보기
		// index 값이 0이상이고 문자열 길이보다 작을때만 method4 실행
		
		// 잘 입력 : 메소드 실행 || 결과 : ~~~~
		// 인덱스 값 잘못 입력 : 인덱스 값이 부적절 합니다.
		
		if(index >= 0 && index < str.length()) {
			System.out.println("결과 : " + n.method4(str, index));
		}else {
			System.out.println("인덱스 값이 부적절 합니다.");
		}
		
		//System.out.println(n.method4(str, index));
		*/
		
		
		// ----- StaticMethod -----
		// 생성 없이 바로 호출 가능
		StaticMethod.method1(); 	// new 생성자가 없어도(만나지 않아도) static 영역에 바로 방을 생성한다.
		StaticMethod.method2();
		System.out.println(StaticMethod.method2()); // return 값은 출력하지 않으면 보이지 않는다.
		StaticMethod.method3("차은우");
		System.out.println(StaticMethod.method4("apple", "kiwi")); // return 값은 출력하지 않으면 보이지 않는다.
	}
	
}
