package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

public class LibraryRun {

	public static void main(String[] args) {
		ArrayList<Book> bList = new ArrayList<>();
		
		//System.out.println(bList); // [] 아무것도 없는 리스트 출력
		
		// 소장책 DB 		// (.add)는 자바에서 제공하는 리스트형 메소드
		bList.add(new Book("100", "잃어버린 승호를 찾아서", "강인호 박사", "동현 출판사", 8500, "『수민스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "수진이의 자서전", "연준이가 옮김", "빛나는 소영출판사", 8500, "영화배우 박수현이 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "박연준 과학동아", "편집부 박준호 선생", "진우 사이언스", 8500, "희연 유튜브에 소개된 과학만화 잡지", 2022,3));
		bList.add(new Book("103", "여진이의 코딩스쿨", "코딩천재 이윤화", "종규네 동네", 9900, "제 13회 지원이가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "형근이의 여행일기", "혜민쓰", "시연21", 3800, "영화감독 임준석이 집필한 영화 전문 잡지", 2021, 4));
		bList.add(new Magazine("105", "철현의 데일리룩", "인플루언서 전혜정", "민교네 책방", 12000, "핫걸 정지용의 샤라웃을 받은 잡지", 2022,11));
		bList.add(new Book("106", "조진원의 미라클모닝", "민수찡", "승협쓰 출판사", 6300, "영재도 2번 성공한 미라클모닝"));
		bList.add(new Book("107", "희승이의 백만가지 요리레시피", "제주도에서 온 수빈이", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));

		//System.out.println(bList); // 가득 차있는 리스트 출력
		
		printBooks(bList);

	}

	public static void printBooks(ArrayList<Book> bs) {
		// 여기서 메뉴열고 구현 시작
		BookController bc = new BookController();
		
		// 1번 생각
		//bc.addBook(bList);  현재 bList는 어레이리스트인데, addBook의 매개변수는 북개체이다.
		
		// 2번 생각
		//bc.addBook(북객체);

		// 3번 생각
		// 반복문 => 북객체
		for(Book b : bs) { // b = bList.get(0) => bList.get(1)
			bc.addBook(b);
			System.out.println(b); // 프로그램 실행시 전체 리스트를 한번에 출력
		}
		
		
		boolean flag = true; // 메뉴 스위치

		while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
			System.out.println("===============================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("===============================");

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴번호를 입력해주세요 : ");
			int menu = sc.nextInt(); // 메뉴 번호 입력
			
			switch (menu) {
			case 1: // 1. 조회하기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 조회하겠습니까?");
				System.out.println("1. 도서관 전체 소장책 조회하기");
				System.out.println("2. 일반도서만 조회하기(잡지 제외)");
				System.out.println("3. 잡지만 조회하기(일반도서 제외)");
				System.out.println("4. 이전으로");
				System.out.println("===============================");

				sc.nextLine();

				System.out.print("메뉴번호를 입력해주세요 : ");
				int search = sc.nextInt();
				
				if (search == 1) {
					System.out.println(bc.getAllBook());
				}
				else if (search == 2) {
					System.out.println(bc.onlySearchBook());
				}
				else if (search == 3) {
					System.out.println(bc.onlySearchMagazine());
				}
				else if (search == 4) {
					flag = true; // 이전으로 가야함
				}
				break;
				
			case 2: // 2. 추가하기
				System.out.print("bNo을 입력하세요 : ");
				String bNo = sc.next(); // *****
				
				System.out.print("책 제목을 입력하세요 : ");
				sc.nextLine();
				String title = sc.nextLine();
				
				System.out.print("작가를 입력하세요 : ");
				String author = sc.nextLine();
				
				System.out.print("출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				
				System.out.print("가격을 입력하세요 : ");
				int price = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("간단한 설명을 입력하세요 : ");
				String description = sc.nextLine();
				
				System.out.print("일반도서이면 true, 잡지이면 false를 입력하세요 : ");
				Boolean bkOrMaga = sc.nextBoolean();
				
				if (bkOrMaga.equals(true)) { // 일반도서일 때
					//book 객체 생성
					bc.addBook(new Book(bNo, title, author, publisher, price, description));
					
				} else if (bkOrMaga.equals(false)) { // 잡지일 때
					System.out.print("출간연도를 입력하세요 : ");
					int year = sc.nextInt();
					System.out.print("출간월을 입력하세요 : ");
					int month = sc.nextInt();
					//magazine객체생성
					bc.addBook(new Magazine(bNo, title, author, publisher, price, description, year, month));
				}

				break;
				
			case 3:// 3. 책 찾기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 찾겠습니까?");
				System.out.println("1. bNo으로 책 찾기");
				System.out.println("2. 책 제목으로 책 찾기");
				System.out.println("3. 출간연도로 잡지 찾기");
				System.out.println("4. 출판사로 책 찾기");
				System.out.println("5. 특정 가격 밑으로 책 찾기");
				System.out.println("6. 이전으로");
				System.out.println("===============================");
				System.out.print("메뉴번호를 입력해주세요 : ");
				sc.nextLine();
				search = sc.nextInt();

				if (search == 1) { // bNo으로 책 찾기
					System.out.print("bNo을 입력하세요 : ");
					bNo = sc.next(); // *****
					sc.nextLine();
					
					System.out.println(bc.searchBookBybNo(bNo));
					
				} else if (search == 2) { // 책 제목으로 책 찾기
					System.out.print("책 제목을 입력하세요 : ");
					sc.nextLine();
					title = sc.nextLine();
					
					System.out.println(bc.searchBookByTitle(title));
					
				} else if (search == 3) { // 출간연도로 잡지 찾기
					System.out.print("출간연도를 입력하세요 : (올해 --> 2022) : ");
					int year = sc.nextInt();
					
					System.out.println(bc.magazineOfThisYearInfo(year));
					
				} else if (search == 4) { // 4. 출판사로 책 찾기
					System.out.print("출판사를 입력하세요 : ");
					publisher = sc.next(); // *****
					
					System.out.println(bc.searchBookByPublisher(publisher));
					
				} else if (search == 5) { // 5. 특정 가격 밑으로 책 찾기
					System.out.print("가격을 입력하세요 : ");
					price = sc.nextInt();
					sc.nextLine();
					
					System.out.println(bc.searchBookByPrice(price));
					
				} else if (search == 6)
					flag = true; // 6. 이전으로
				else
					System.out.println("잘못 입력하셨습니다.");
				
				break;
				
			case 4:// 4. 전체책 가격 합계 및 평균 조회
				System.out.println("전체책 가격 합계 : " + bc.getTotalPrice() + "원");
				System.out.println("전체책 가격 평균 : " + bc.getAvgPrice() + "원");
				break;
				
			case 5: 
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				break;
			}
		}
	}
}
