package com.kh.chap01_list.part02_MVC.controller;
// 사용자의 요청 처리해주는 클래스!! 출력문 쓰지 않기!!

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

/**
 * @author 김수진
 *
 */
public class MusicController {
	private ArrayList<Music> list = new ArrayList<Music>(); 							// 전역 선언을 해야만 모든 메소드에서 사용 가능함
	{ // 초기화 블럭
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
	}
	
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	public ArrayList<Music> selectMusic() {												// return 값에 맞춰 반환형 설정
		return list;
	}
	
	public int deleteMusic(String title) {												// (추가)몇 건이 삭제되었습니다 => int형 반환으로 사용 가능함.
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				//System.out.println("성공적으로 삭제됐습니다.");
				break; // 반복문 빠져나오기
			}
		}
		// result == 0 (삭제할 곡을 못찾음) | 1 (성공적으로 삭제했다)
		return result;
	}
	
	public ArrayList<Music> searchMusic(String keyword) {								// (추가)조회된 목록을 조회해야함 => ArrayList형 반환으로 사용 가능함.
		ArrayList<Music> searchList = new ArrayList<Music>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
	}
	
	public int updateMusic (String title, String upArtist, String upTitle) {			// (추가)몇 건이 갱신되었습니다 => int형 반환으로 사용 가능함.
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result = 1;
				break;
			}
		}
		
		return result;
	}
	
}
