package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;
import com.kh.chap03_class.model.vo.Person;

public class EncapsulationRun {
	
	/*
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게끔!!!
	 * 
	 *  * 캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나
	 *			 클래스에서 가장 중요한 목적인 "데이터 접근 제한"을 원칙으로
	 *			 외부로부터 "데이터의 직접 접근을 막고"
	 *			 대신에 "데이터를 간접적으로나마 처리(값을 대입, 값을 출력)"할 메소드를 클래스 내부에 작성해서 관리
	 *
	 *	1) 정보은닉 : private
	 * 		 직접 접근을 막기위해 private 라는 접근제한자를 사용
	 *
	 */

	public static void main(String[] args) {
		// 우영우 라는 학생 객체를 만들어보자
		
		Student woo = new Student();
		
		// 직접 접근을 해서 값 대입을!!!
		/*
		woo.name = "우영우";
		woo.age = 20;
		woo.height = 162.3;
		woo.korScore = 100;
		woo.mathScore = 90;
		*/
		
		
		//woo.method1(10);
		//woo.setName("우영우");
		woo.setName("우영우");
		woo.setAge(20);
		woo.setHeight(162.3);
		woo.setKorScore(100);
		woo.setMathScore(90);
		
		//System.out.println(woo.name); // 직접 접근 불가
		System.out.println(woo.getName());
		System.out.println(woo.getAge());
		System.out.println(woo.getHeight());
		System.out.println(woo.getKorScore());
		System.out.println(woo.getMathScore());
		
		// 수정사항이 생겼다. 나이 : 20 -> 25
		woo.setAge(25);
		
		System.out.println("=== 수정후 ===");
		System.out.println(woo.getAge());
		
		
		System.out.println();
		System.out.println("=== 생성자 만들고 난 후 ===");
		System.out.println();
		Student per = new Student();
		System.out.println(per.information());
		System.out.println();
		Student per1 = new Student("김수진", 170.2, 98);
		System.out.println(per1.information1());
		Student per2 = new Student("김수진", 25, 170.2, 98, 95);
		System.out.println(per2.information());

	}

}
