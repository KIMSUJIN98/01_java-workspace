package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		User u1 = new User(); // 여태까지 생성자를 별도로 작성하지 않아도 JVM이 기본 생성자(매개변수 생성자는 아님)를 자동으로 만들어주고 있었음
		// 매개변수 생성자가 하나라도 있는 경우, JVM이 자동으로 기본생성자를 만들지 않기에 에러발생 : 기본생성자 없이 매개변수 생성자만 만들 경우 에러 발생
		System.out.println(u1.information());
		
		// 각 필드에 JVM의 초기값이 담겨 있음!!
		
		// 1. 객체 생성 후 값을 대입하는 방법
		// 회원가입시 필수 입력사항만 받는다면?
		/*
		u1.setUserId("user01");
		u1.setUserPwd("pwd01");
		u1.setUserName("차은우");
		*/
		
		// 2. 매개변수 3개까지 생성자로 객체 생성 : 페어를 완벽하게 맞춰줘야함.
		User u2 = new User("user02", "pwd02", "차은우");
		
		System.out.println(u2.information());
		
		// 3. 매개변수 전체 필드 넣어서 생성자 만들고 객체 생성
		User u3 = new User("User03", "pwd03", "장원영", 18, 'F');
		System.out.println(u3.information());
		
		// 그럼 setter 안만들어도 되지 않을까..? 귀찮아... => 안됨 만들어야함
		// 차은우 -> 차으누	// 하나의 값만 바꿔야하는 경우가 생길 수 있다 (개명 등)
		u2.setUserName("차으누");
		System.out.println(u2.information());
		
		// 그럼 getter는 안만들면 안될까?
		// 비번을 까먹은 경우에는 비번만 보여줘야함	// 비밀번호 찾기 등 특정 데이터 하나만을 뿌려주고 싶을때 사용해야 한다.
		System.out.println(u2.getUserPwd());
	}

}
