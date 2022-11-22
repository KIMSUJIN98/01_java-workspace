package com.kh.chap01_list.part02_MVC.view;
// 화면을 담당하는 클래스 (출력문, 입력문)

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.chap01_list.part02_MVC.controller.MusicController;
import com.kh.chap01_list.part02_MVC.model.vo.Music;


/**
 * @author 김수진
 * @since  2022.11.22
 *
 */

public class MusicMenu {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		while(true) {
			
			System.out.println("\n=== Welcome 별밤 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = 9; 														// 0으로 선언해버리면 예외나는 순간 그대로 menu = 0이 되면서 프로그램이 종료됨
			try {
				menu = sc.nextInt();
			}catch (InputMismatchException e) {
				
			}
			
			sc.nextLine();
			
			switch (menu) {
			case 1:
				insertMusic();
				break;
			case 2:
				selectMusic();
				break;
			case 3:
				deleteMusic();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				return;
			case 9:																// default로 내려가서 break 걸리게끔
			default:
				break;
			}
		}
		
	}
	
	
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n=== 새로운 곡 추가 ===");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title,artist);
		System.out.println("성공적으로 곡이 추가되었습니다.");
		
		
	}
	
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		
		System.out.println("\n=== 전체곡 리스트 ===");
		
		ArrayList<Music> list = mc.selectMusic();							 // System.out.println(list);를 하게되면 요소들이 한줄로 ,를 달고 나오게 된다.
		
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		if(list.isEmpty()) { // 리스트가 비어있을 경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else { // 그게 아닐 경우(즉, 뭐라도 담겨있을 경우)
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		
	}
	
	/**
	 * 3. 특정 곡 삭제시켜주는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n=== 특정 곡 삭제 ===");
		
		System.out.print("삭제하고자 하는 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title); 								// title "눈의꽃"을 입력받아 보내고, 그 결과로 result "1 또는 0"을 받아옴
		
		if(result == 1) { // 무언가 삭제됨
			System.out.println("성공적으로 삭제됐습니다.");
		}else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
	}
	
	
	/**
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		
		System.out.println("\n=== 특정 곡 검색 ===");
		
		System.out.print("검색할 곡 명 (키워드만도 가능) : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(keyword);				// keyword "At"를 입력받아 보내고, 그 결과로 searchList "Music [title=Attention, artist=뉴진스]"를 받아옴
		
		System.out.println("\n=== 검색 결과 ===");
		
		if(searchList.isEmpty()) { // 텅 비어있을 경우
			System.out.println("검색된 결과가 없습니다.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
	}
	
	/**
	 * 5. 특정곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		System.out.println("\n=== 특정 곡 수정 ===");
		System.out.print("수정 하고자 하는 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(가수) : ");
		String upArtist = sc.nextLine();
		
		System.out.print("수정 내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		int result = mc.updateMusic(title, upArtist, upTitle);				// (title, upArtist, upTitle)을 입력받아 보내고, 그 결과로 result "1 또는 0"을 받아옴
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		}else { // result == 0
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		
	}

}
