package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	public void method1() {
		/*
		String s = "안녕"; 	// 참조자료형
		int a = 10; 		// 기본자료형
		*/
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("Hello"); // 매개변수 생성자
		String str2 = new String("Hello"); // 매개변수 생성자
		
		// 주소값이 출력되지 않을까?
		System.out.println(str1/*.toString()*/);
		System.out.println(str2);
		// String 클래스에 toString() 메소드가 이미 오버라이딩 돼있음! (실제 담긴 문자열 반환하도록)
		
		// 동등비교										// (주소값을 본다)
		System.out.println(str1 == str2); 				// false
		System.out.println(str1.equals(str2)); 			// true
		// String 클래스에 equals 메소드 이미 오버라이딩 돼있음!
		// Object 클래스 확인해보면 원래는 주소값을 동등비교하는 메소드임!!
		
		System.out.println(str1.hashCode());			// 12345678 동일한 결과값
		System.out.println(str2.hashCode());			// 12345678 동일한 결과값
		// String 클래스에 hashCode 메소드 이미 오버라이딩 돼있음!!
		// 주소값이 아닌 실제 담겨있는 문자열(Hello)을 가지고 해쉬코드를 만듦
		
		// 근데 나는 주소값을 꼭 알고싶다.
		// System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	public void method2() {
		String str = new String("Hello");
		
		// 2. 문자열을 리터럴 값으로 생성하는 것
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());				// 12345678 동일한 결과값
		System.out.println(str2.hashCode());				// 12345678 동일한 결과값
		
		System.out.println(str1 == str2); // 엥? true임!! (주소값이 일치함)
		
		System.out.println("str1의 주소값 : " + System.identityHashCode(str1)); 	// 1234567890 동일한 결과값
		System.out.println(System.identityHashCode(str2)); 	// 1234567890 동일한 결과값
		System.out.println(System.identityHashCode(str)); 	// 0987654321 다른 주소 결과값
		
		String str3 = "Hi";
		
		System.out.println(str1 == str3); 					// false
		System.out.println(System.identityHashCode(str3)); 	// 8765432109 다른 주소 결과값
		
		// String 클래스 == 불변클래스(변하지 않는 클래스)
		// 그럼 값을 못바꾸는건가요? 그건아님...
		// 변경이 가능하기 하나 그 자리에서 수정되는 개념이 아님!!
		
		str3 = "Bye";
		System.out.println(System.identityHashCode(str3));  // 6543210987 기존의 str3의 주소값과도 다른 결과값 : 기존의 주소값은 사용하지 않기에 추후 JVM의 가비지 컬렉터가 지울 예정
		
		str3 = "Hello";
		System.out.println(System.identityHashCode(str3));  // 1234567890 동일한 결과값 	// String Pool내에서 str1과 내용이 중복되므로 같은 주소값을 가짐
		
	}

}
