package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {

	ArrayList<Book> bList = new ArrayList<>();
	
	@Override
	public void addBook(Book nBook) {
		bList.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
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
