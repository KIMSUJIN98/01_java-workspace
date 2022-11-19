package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	private ArrayList<Book> bList = new ArrayList</*Book*/>(); // 다른거에 의해 bList가 변경되지 않도록 private 접근제한자
	
	
	@Override
	public void addBook(Book nBook) {
		// 도서번호 중복 : 만들면 안됨. // 도서번호 중복되지 않음 : 만듦
		// for문 + if문
		
		boolean find = true; // flag 변수 : 지표, 깃발..
		for(Book b : bList) { // b = bList.get(0)
			if(b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : " + nBook.getTitle() + "도서는 이미 소장하고 있습니다.");
				find = false; // 중복됨
				break;
			}
		}
		
		if(find == true) { // 중복이 안됨
			bList.add(nBook);
			System.out.println("도서명 : " + nBook.getTitle() + "도서가 성공적으로 추가됐습니다.");
		}
		
		

		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		// ArrayList<Book> aList = new ArrayList<>(); 새로운 객체 생성이 무의미함
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		// 기억해야할 것 *********
		// 반환형 객체를 하나는 꼭 만들기
		Book search = new Book();
		
		// 객체만든 이후 return에 넘겨주는 습관
		
		// 순차탐색 => for문(o) if문
		for(Book b : bList) { // b = bList.get(0) => book 객체
			if(b.getbNo().equals(bNo)) {
				search = b;
			}
		}
		return search;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		// searchList : 반환형 객체
		// 키워드 검색 : equals(x), contains(o)
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		// for문 if문
		for(Book b : bList) {
			if(b.getTitle().contains(title)) {
				searchList.add(b);
			}
		}
		return searchList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> bookList = new ArrayList<>();
		
		/*
		// 방법 1.
		for(Book b : bList) {
			if(b instanceof Book) {
				bookList.add(b);
			}
		}
		*/
		
		// 방법 2.
		for(Book b : bList) {
			if(b instanceof Magazine) {
				continue; // if문에 continue 안쓰고 공란으로 두어도 된다.
			}else {
				bookList.add(b);
			}
		}
		return bookList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		// magazineList
		ArrayList<Book> magazineList = new ArrayList<>();
		
		for(Book b : bList) {
			if(b instanceof Magazine) {
				magazineList.add(b);
			}
		}
		return magazineList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> mList = new ArrayList<>();
		
		for(Book b : bList) { // b = bList.get(0)
			if(b instanceof Magazine) { // instanceof로 Magazine만 차출해낸다
				if(((Magazine)b).getYear() == year) { // 그냥 이것만 써서는 안됨 : Book 객체는 year 요소가 없으므로 비교할 대상이 없기에 에러발생
					mList.add(b);
				}
			}
		}
		return mList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		// pubList
		ArrayList<Book> pubList = new ArrayList<>();
		
		for(Book b : bList) {
			if(b.getPublisher().contains(publisher)) {
				pubList.add(b);
			}
		}
		return pubList;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> pList = new ArrayList<>();
		
		for(Book b : bList) {
			if(b.getPrice() <= price) {
				pList.add(b);
			}
		}
		return pList;
	}

	@Override
	public int getTotalPrice() {
		// 누적합
		int total = 0;
		for(Book b : bList) { // b = bList.get(0)
			// sum += i;
			total += b.getPrice();
		}
		return total;
	}

	@Override
	public int getAvgPrice() { // 국 영 수 평균 : 국어 + 영어 + 수학 / 3
		// 누적합
		int total = 0;
		for(Book b : bList) { // b = bList.get(0)
			// sum += i;
			total += b.getPrice();
		}
		int avg = total / bList.size();
		return avg;
	}
	

}
