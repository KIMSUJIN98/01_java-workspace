package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> pNum = new HashMap<>();
		
		pNum.put("손흥민", "010-1234-5678");
		pNum.put("김민재", "010-5678-9876");
		pNum.put("지소연", "010-4567-9876");
		
		while(true) {
			System.out.println("===== 전화번호부 =====");
			System.out.println("1. 전체 연락처 목록보기");
			System.out.println("2. 저장된 연락처 검색하기");
			System.out.println("3. 새로운 연락처 추가하기");
			System.out.println("4. 저장된 연락처 삭제하기");
			System.out.println("5. 저장된 연락처 수정하기");
			System.out.println("6. 전화번호부 종료하기");
			System.out.println("===================");
			System.out.print("무슨 작업을 하시겠습니까? : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				Set keySet = pNum.keySet();
				Iterator itKey = keySet.iterator();
				
				while(itKey.hasNext()) {
					String key = (String)itKey.next();
					String value = pNum.get(key);
					System.out.println(key + "님의 연락처 : " + value);
				}
				break;
				
			case 2:
				System.out.print("찾고 싶은 연락처는? (이름) : ");
				String word = sc.nextLine();
				
				String phone = pNum.get(word);
				if(phone == null) {
					System.out.println(word + "님의 연락처는 목록에 없습니다.");
				}else {
					System.out.println(word + "님의 연락처 : " + phone);
				}
				break;
				
			case 3:
				System.out.print("연락처에 추가할 이름 : ");
				String newName = sc.nextLine();
				
				if(pNum.containsKey(newName)) {
					System.out.println("이미 저장된 연락처가 있습니다.");
				}else {
					System.out.print("연락처에 추가할 번호 : ");
					String newNum = sc.nextLine();
					pNum.put(newName, newNum);
					System.out.println(newName + "님의 연락처가 정상적으로 저장되었습니다.");
				}
				break;
				
			case 4:
				System.out.print("삭제하고자 하는 연락처(이름) : ");
				String delName = sc.nextLine();
				
				if(pNum.containsKey(delName)) {
					pNum.remove(delName);
					System.out.println(delName + "님의 연락처가 삭제되었습니다.");
				}else {
					System.out.println("삭제할 연락처가 없습니다.");
				}
				break;
				
			case 5:
				System.out.print("수정하고자 하는 연락처(이름) : ");
				String repName = sc.nextLine();
				System.out.print("새로운 전화번호 입력 : ");
				String repPhone = sc.nextLine();
				
				if(pNum.containsKey(repName)) {
					pNum.replace(repName, repPhone);
					System.out.println(repName + "님의 연락처가 갱신되었습니다.");
				}
				break;
				
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			}
		}
	}
}
