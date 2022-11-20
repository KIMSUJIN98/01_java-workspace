package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {

	ArrayList<Book> bList = new ArrayList<>();
	
	@Override
	public void addBook(Book nBook) {
		for(Book b : bList) {
			if(b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : " + nBook.getTitle() + "도서는 이미 소장하고 있습니다.");
				return;
			}
		}
		bList.add(nBook);
		System.out.println("도서명 : " + nBook.getTitle() + "도서가 성공적으로 추가됐습니다.");
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book search = new Book();
	
		for(Book b : bList) {
			if(b.getbNo().equals(bNo)) {
				search = b;
			}
		}
		return search;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> searchList = new ArrayList<>();
		
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
		
		for(Book b : bList) {
			if(b instanceof Magazine) {
				continue;
			}else {
				bookList.add(b);
			}
		}
		return bookList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
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
		
		for(Book b : bList) {
			if(b instanceof Magazine) {
				if(((Magazine) b).getYear() == year) {
					mList.add(b);
				}
			}
		}
		return mList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
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
		int total = 0;
		for(Book b : bList) {
			total += b.getPrice();
		}
		return total;
	}

	@Override
	public int getAvgPrice() {
		int total = 0;
		for(Book b : bList) {
			total += b.getPrice();
		}
		int avg = total / bList.size();
		return avg;
	}
	

}
