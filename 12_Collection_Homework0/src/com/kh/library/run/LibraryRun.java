package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

public class LibraryRun {

	public static void main(String[] args) {// 소장책 DB
		ArrayList<Book> bList = new ArrayList<>();

		// 생성 DB
		bList.add(new Book("100", "잃어버린 승호를 찾아서", "강인호 박사", "동현 출판사", 8500, "『수민스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "수진이의 자서전", "연준이가 옮김", "빛나는 소영출판사", 8500, "영화배우 박수현이 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "박연준 과학동아", "편집부 박준호 선생", "진우 사이언스", 8500, "희연 유튜브에 소개된 과학만화 잡지", 2022,3));
		bList.add(new Book("103", "여진이의 코딩스쿨", "코딩천재 이윤화", "종규네 동네", 9900, "제 13회 지원이가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "형근이의 여행일기", "혜민쓰", "시연21", 3800, "영화감독 임준석이 집필한 영화 전문 잡지", 2021, 4));
		bList.add(new Magazine("105", "철현의 데일리룩", "인플루언서 전혜정", "민교네 책방", 12000, "핫걸 정지용의 샤라웃을 받은 잡지", 2022,11));
		bList.add(new Book("106", "조진원의 미라클모닝", "민수찡", "승협쓰 출판사", 6300, "영재도 2번 성공한 미라클모닝"));
		bList.add(new Book("107", "희승이의 백만가지 요리레시피", "제주도에서 온 수빈이", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));

		printBooks(bList);

	}

	public static void printBooks(ArrayList<Book> bs) {
		// 여기서 메뉴열고 구현 시작
		
		BookController bc = new BookController();
		
		for(Book b : bs) {
			bc.addBook(b);
			System.out.println(b);
		}
		
		boolean flag = true;
		while(flag = true) {
			System.out.println("=============================================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("=============================================");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴번호를 입력해주세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:	// 조회하기
				break;
			case 2:	// 추가하기
				break;
			case 3:	// 책 찾기
				break;
			case 4: // 전체책 가격 합계 및 평균 조회
				
				
				
				break;
			case 5: // 프로그램 종료
				break;
			default: // 메뉴 다시 받기
				flag = true;
				break;
			}
			
		}
		
		
	}
}
