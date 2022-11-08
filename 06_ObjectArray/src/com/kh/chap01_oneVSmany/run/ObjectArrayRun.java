package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 객체 배열 활용해서 해보기!!!
		// 세 개의 Book 객체를 관리한다면??
		
		//int[] arr = new int[3];
		Book[] books = new Book[3]; 		// Book 자체가 자료형이다.
		
		for(int i = 0; i<books.length; i++) {
			System.out.println(i+1 + "번째 도서정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			/*
			books[0] = new Book(어쩌구);
			books[1] = new Book(저쩌구);
			books[2] = new Book(얼씨구);
			*/
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		// 객체 생성 끝!!
		
		/*
		System.out.println(books[0].information());
		System.out.println(books[1].information());
		System.out.println(books[2].information());
		*/
		
		// 전체 도서 정보들 조회하기 => 반복문 활용 가능
		for(int i =0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		/*
		if(books[0].getTitle().equals(search)) { 			// 단독 if-else로 가야 한다 : 책 제목은 같지만 저자나 출판사가 다른 경우도 존재하기 때문이다.
			System.out.println(books[0].information()); 		// if-else if-else로 갈 경우, 선행 조건이 만족되면 그 지점에서 멈추고 빠져나오게 된다.
		}
		
		if(books[1].getTitle().equals(search)) {
			System.out.println(books[1].information());
		}
		
		if(books[2].getTitle().equals(search)) {
			System.out.println(books[2].information());
		}
		*/
		
		for(int i =0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) { 			// 단독 if-else로 가야 한다 : 책 제목은 같지만 저자나 출판사가 다른 경우도 존재하기 때문이다.
				System.out.println(books[i].information()); 		// if-else if-else로 갈 경우, 선행 조건이 만족되면 그 지점에서 멈추고 빠져나오게 된다.
			}
		}
		
	}

}
