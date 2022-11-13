package com.kh.chap00_myInheritance.run;

import java.util.Scanner;

import com.kh.chap00_myInheritance.model.vo.Kimbab;
import com.kh.chap00_myInheritance.model.vo.Pizza;
import com.kh.chap00_myInheritance.model.vo.Sushi;

public class FoodRun {

	public static void main(String[] args) {
		
		/*

		// Pizza 객체 생성
		// fName, price, category, starScore, cheeseCrust
		
		Pizza p1 = new Pizza("포테이토피자", 15000, "양식", 3.5, true);
		Pizza p2 = new Pizza("하와이안피자", 17000, "양식", 0.5, false);
		
		// Sushi 객체 생성
		// fName, price, category, starScore, source
		Sushi s1 = new Sushi("연어초밥", 2500, "일식", 4.5, "초장");
		Sushi s2 = new Sushi("새우초밥", 2500, "일식", 3.6, "간장");
		
		// Kimbab 객체 생성
		// fName, price, category, starScore, takeOut
		Kimbab k1 = new Kimbab("참치김밥", 1700, "한식", 5.0, true);
		Kimbab k2 = new Kimbab("돈까스김밥", 2800, "한식", 2.9, false);
		
		// pizza객체 수정
		p1.setCategory("이탈리안식");
		p2.setCheeseCrust(true);
		
		// sushi 객체 수정
		s1.setSource("간장");
		s2.setPrice(5500);
		
		// kimbab 객체 수정
		k1.setTakeOut(false);
		k2.setfName("왕왕큰돈까스김밥");
		
		// 객체출력
		System.out.println("================Pizza 객체 출력================");
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println();
		
		System.out.println("================Sushi 객체 출력================");
		System.out.println(s1.information());
		System.out.println(s2.information());
		System.out.println();
		
		System.out.println("================Kimbab 객체 출력================");
		System.out.println(k1.information());
		System.out.println(k2.information());
		System.out.println();
		
		*/
		
		Pizza[] pArr = new Pizza[3];
		
		pArr[0] = new Pizza("와일드 와일드 웨스트 스테이크", 33900, "양식", 5.0, true);
		pArr[1] = new Pizza("블랙타이거 슈림프", 36900, "양식", 4.2, true);
		pArr[2] = new Pizza("블록버스터4", 29500, "양식", 2.2, false);
		
		Sushi[] sArr = new Sushi[3];
		
		sArr[0] = new Sushi("묵은지초밥", 1500, "일식", 3.2, "참기름");
		sArr[1] = new Sushi("날치할군함", 1900, "일식", 1.2, "없음");
		sArr[2] = new Sushi("오이마끼", 1100, "일식", 2.2, "간장");
		
		Kimbab[] kArr = new Kimbab[3];
		
		kArr[0] = new Kimbab("새우김밥", 2700, "한식", 3.8, false);
		kArr[1] = new Kimbab("소불고기김밥", 4900, "한식", 1.3, true);
		kArr[2] = new Kimbab("매콤어묵김밥", 2900, "한식", 3.2, false);
		
		/*
		System.out.println("================Pizza 객체 출력================");
		for(Pizza p: pArr) {
			System.out.println(p.information());
		}
		System.out.println();
		
		
		System.out.println("================Sushi 객체 출력================");
		for(Sushi s: sArr) {
			System.out.println(s.information());
		}
		System.out.println();
		
		System.out.println("================Kimbab 객체 출력================");
		for(Kimbab k: kArr) {
			System.out.println(k.information());
		}
		System.out.println();
		*/
		
		// 사용자에게 메뉴번호를 입력 받아 프로그램 돌리기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("##########음식 자판기##########");
			System.out.println("1. 피자");
			System.out.println("2. 초밥");
			System.out.println("3. 김밥");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("구매하시려고 하는 상품 번호를 입력해주세요 : ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch (menu) {
			case 1:
				for(Pizza p: pArr) {
					System.out.println(p.information());
				}
				break;
			case 2 :
				for(Sushi s: sArr) {
					System.out.println(s.information());
				}
				break;
			case 3 :
				for(Kimbab k: kArr) {
					System.out.println(k.information());
				}
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("메뉴에 없는 번호입니다. 다시 입력해주세요.");
				break;
			}
			
			System.out.print("구매하고자 하는 상품명을 입력해주세요 : ");
			String fn = sc.nextLine();
			
			System.out.print("결제수단을 선택해주세요 (카드, 현금) ** 카드는 수수료 0.5%가 더 부과됩니다. : ");
			String pay = sc.nextLine();
			
			for(Pizza p :pArr) {
				if(p.getfName().equals(fn)) {
					System.out.println(p.getfName() + "의 가격은 : " + p.getPrice() + "원 입니다.");
				}else if(p.getfName().equals(fn) && pay.equals("카드")) {
					p.setPrice((int)(p.getPrice() * 1.05));
					System.out.println(p.getfName() + "의 가격은 : " + p.getPrice() + "원 입니다.");
				}
			}
			
			for(Sushi s :sArr) {
				if(s.getfName().equals(fn) && pay.equals("현금")) {
					System.out.println(s.getfName() + "의 가격은 : " + s.getPrice() + "원 입니다.");
				}else if(s.getfName().equals(fn) && pay.equals("카드")) {
					s.setPrice((int)(s.getPrice() * 1.05));
					System.out.println(s.getfName() + "의 가격은 : " + s.getPrice() + "원 입니다.");
				}
			}
			
			for(Kimbab k :kArr) {
				if(k.getfName().equals(fn) && pay.equals("현금")) {
					System.out.println(k.getfName() + "의 가격은 : " + k.getPrice() + "원 입니다.");
				}else if(k.getfName().equals(fn) && pay.equals("카드")) {
					k.setPrice((int)(k.getPrice() * 1.05));
					System.out.println(k.getfName() + "의 가격은 : " + k.getPrice() + "원 입니다.");
				}
			}
			
		}
		
		
		
		
		
	}

}











