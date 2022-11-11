package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용 안했을때!!!

public class ElectronicShop1 {

	// 용산 전자상가에 있는 가게
	// 3개 제품을 마련할 자리부터 만들자 => 창고
	
	//private int price; // 기본자료형
	
	private Desktop desk; // 내가 만든 자료형
	private NoteBook note; // 객체생성은 안되고 텅 비어있음
	private Tablet tab;
	
	// 이건 실제로 객체 생성이 된것은 아니다.
	// 필드가 메모리상에 확보되는 순간 => 객체가 생성되는 순간
	
	// 반환값 모르겠으면 일단은 void
	// Desktop 생성 메소드
	
	// Desktop 객체를 받아줄 수 있게 매개변수 작성
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~);
		desk = d;
		// 내가 만든 데스크탑 객체를 desk 라는 창고에 적재하겠다.
	}
	
	// NoteBook 생성 메소드
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(~~~);
		note = n;
		// 내가 만든 노트북 객체를 note 라는 창고에 적재하겠다.
	}
	
	// Tablet 생성 메소드
	public void insert(Tablet t) { // Tablet t = new Tablet(~~~);
		tab = t;
		// 내가 만든 태블릿 객체를 tab 이라는 창고에 적재하겠다.
	}
	
	// 동일한 클래스에 동일한 메소드명으로 여러개 만들어져있는것 => 오버로딩
	// 단, 매개변수는 달라야 한다!!
	// 오버로딩이 적용 돼있음                                           
	
	// 조회
	// 모르겠으면 일단은 반환형을 void로 가자! => 나중에 수정 가능!

	public Desktop selectDesktop() {
		return desk;
		// desk 라는 창고가 내가 만든 데스크탑 객체를 담고 있기 때문에 desk를 리턴
		// 오류가 난다. 왜? => 반환형이 void 이기 때문!!
		// 내가 리턴하려고 하는 값의 자료형으로 반환형을 써줘야 한다.
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	// insert 처럼 select도 같은 이름으로 하면 안되는 이유는?
	// 매개변수가 없기 때문에 불가능함 => 중복됨 => 오류남
	
	// 현재는 메소드가 총 6개!
	// 다형성을 적용하면? 2개~3개로 줄이기 가능!!!
	
}
