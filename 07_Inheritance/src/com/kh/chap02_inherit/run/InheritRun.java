package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun /*extends Object*/ {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		
		Ship s = new Ship("낚시배", 3, "어선", 1);
		
		Airplane a = new Airplane("종이비행기", 0.01, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		System.out.println("======================================== 2022.11.17 추가사항 : Collection ========");
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();			// new 뒤 <Vehicle>의 Vehicle은 생략가능
		
		list.add(new Car("벤틀리", 12.5, "세단", 4)); 					// 현재 제네릭은 Vehicle. 자식이라 형변환 없이 가져올 수 있다.
		list.add(new Ship("낚시배", 3, "어선", 1));
		list.add(new Airplane("종이비행기", 0.01, "제트기", 10, 4));
		
		// 1. 단순 for문(for loop문)
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
			list.get(i).howToMove();
		}
		
		
		// 2. 향상된 for문
		for(Vehicle v : list) { // v= list.get(0) => list.get(1)
			System.out.println(v.information());
			v.howToMove();
		}
		
		
		System.out.println("======================================== 2022.11.17 추가사항 : Collection FIN ========");
		
		
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이 (유지보수, 생산성 up!)
		 * 
		 * * 상속의 특징
		 * - 클래스간의 상속에 있어서는 다중 상속이 안된다. (단일 상속만 가능 즉, 부모는 하나다) 		// 클래스 간의 상속이 아닌 경우, 다중 상속이 되는 경우도 있다. (추후 학습)
		 * - 부모클래스에 정의돼있는 protected 필드는 자식 클래스에서 직접 접근 가능
		 * - 자식 객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능 						// c, s, a와 같은 자식 객체 / 부모 클래스에 있는 메소드 howToMove() 등
		 * 			+ 부모클래스에 있는 메소드가 맘에 안들면 자식클래스에서 오버라이딩 가능(내입맛대로 재정의)
		 * - 명시되어있지는 않지만 모든 클래스(제공하는 클래스, 직접만드는 클래스)는 Object 클래스의 후손이다. 		// Math와 같은 제공하는 클래스
		 * => 즉, Object 클래스에 있는 메소드를 마음대로 호출 가능
		 * => 뿐만 아니라 오버라이딩을 통해서 재정의도 가능함!!
		 */
		
		System.out.println(c.hashCode());
		System.out.println(c.equals(s));					// 여지껏 써왔던 .equals 또한 Object에 속해 있었다.
		System.out.println(c/*.toString()*/);				// 객체만 생성하면 주소값이 나왔었는데 사실 .toString()이 생략된거였다.
		System.out.println(c.toString()); 					// 자식클래스 (Car.java)에 toString 메소드가 생성되면서 16진수의 주소값이 아닌 내용을 출력하게 되었다.
															// 부모클래스인 Object의 toString() 메소드 보다 자식클래스인 Car의 toString() 메소드에 우선순위가 주어진다.
	}

}
