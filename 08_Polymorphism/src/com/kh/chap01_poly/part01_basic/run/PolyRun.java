package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		// 기억해둘것!!! '=' 기준으로 해서 왼쪽과 오른쪽의 자료형(타입)은 같아야됨!!!
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 Parent 에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // 자동형변환 된거였음!! (Child1 => Parent) 		// 상속받았으므로 부모의 메소드도 사용가능하다.
		//((Parent)c1).printParent();
		// c1 레퍼런스로 child1, Parent 둘다 접근 가능
		// Parent 접근시 자동으로 형변환 된 채로 진행된거임
		
		System.out.println("3. 부모타입의 레퍼런스로 자식객체를 다루는 경우(다형성)");
		Parent p2 = /*(Parent)*/new Child1(); // 자료형이 다르다? => 에러안뜸!! => 자동형변환 된거임.
		p2.printParent();
		//p2.printChild1(); 											// 사용불가
		((Child1)p2).printChild1(); // 강제형변환을 하면 호출은 가능!!
		
		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환을 통해 접근해야한다!!
		
		/*
		 * 상속 구조의 클래스들 간에는 형변환 가능
		 * 
		 * 1. UpCasting
		 *	  자식타입 -> 부모타입으로 형변환
		 *	  자동형변환
		 *	  ex) 자식.부모메소드();
		 *		  부모 = (부모)자식객체;
		 *
		 * 2. DownCasting
		 * 	  부모타입 -> 자식타입으로 형변환
		 * 	  강제형변환
		 * 	  ex) ((자식)부모).자식메소드()
		 * 
		 * 	  상속구조 아니면 안된다.
		 * 
		 */
		
		// 다형성 정의
		// - 부모타입으로 부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로도 다룰 수 있다.
		
		// 다형성을 쓰는 목적
		// 다형성을 배우기전.....
		
		// Child1 객체 2개랑 Child2 객체 2개를 관리해야함. => 총 4개
		Child1[] arr1 = new Child1[2]; 									// 배열만 생성하고(방만 만들고) 객체는 안만들어진 상태
		
		arr1[0] = new Child1(1, 2, 4); // 객체1
		arr1[1] = new Child1(2, 3, 5); // 객체2
		
		Child2[] arr2 = new Child2[2];
		
		arr2[0] = new Child2(2, 1, 5); // 객체3
		arr2[1] = new Child2(5, 7, 2); // 객체4
		
		
		//-------------------------------------------------------------------------------
		// 다형성을 적용한 후
		Parent[] arr = new Parent[4];
		
		// Parent타입 : arr[0] ~ arr[3]은 모두 Parent타입이다.
		arr[0] = new Child1(1, 2, 4); // 객체1
		arr[1] = new Child2(2, 1, 5); // 객체2
		arr[2] = new Child2(5, 7, 2); // 객체3
		arr[3] = new Child1(2, 3, 5); // 객체4
		// 하나의 부모타입만으로 여러 자식 객체를 받을 수 있음 => 편리하다, 코드길이 감소
		
		System.out.println("=============================================================");
		
		arr[0].printParent();
		// arr[0].printChild1(); 													// arr[]이 Parent타입이므로 불가능하다
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		// ((Child1)arr[2]).printChild1(); // ClassCastException : 부적절한 형변환		// 썼을때는 에러가 나지 않지만 run을 돌려보면 에러가 난다
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("====================== 반복문 이용해서 출력 =======================");
		for(int i =0; i<arr.length; i++) {
			
			/*
			 * instanceof 연산자 => 연산결과 true, false로 반환
			 * 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때 사용
			 * 
			 */
			
			
			/*if(i == 0 || i == 3) {*/
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
		} // 양다리 : 공유(연상) 오빠~~~ // 은우(연하) 은우야~~
		
		System.out.println("=============================================================");
	//  Parent	   (Parent)Child1
		Parent pp = new Child1();
		//pp.print(); 												// Parent의 "나 부모야"가 아닌 Child1의 "나 첫번쨰 자식이야"가 출력되버림.
		
		/*
		 * 동적바인딩 : 프로그램이 실행되기전에는 컴파일 되면서 정적바인딩(레퍼런스 타입의 메소드를 가리킴)
		 * 			단, 실질적으로 참조하는 자식클래스에 해당메소드가 오버라이딩이 돼있다면
		 * 			프로그램 실행시 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행.
		 */
		
		for(int i =0; i<arr.length; i++) {
			arr[i].print();
		}
	}
	
	

}
