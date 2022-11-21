package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		// put
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.print("찾고 싶은 단어는? : ");
			String word = sc.nextLine();
			
			if(word.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			String kor = dic.get(word); // vavy				// word에 vavy 같이 없는 단어 입력시 kor는 null 반환
			if(kor == null) {
				System.out.println(word + "는 없는 단어 입니다.");
			}else {
				System.out.println(kor);
			}
			
		}

	}

}
