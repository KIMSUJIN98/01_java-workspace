package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		String result = "";
		switch(menu) {
		case 1 :
			result = "입력";
			break;
		case 2 :
			result = "수정";
			break;
		case 3 :
			result = "조회";
			break;
		case 4 :
			result = "삭제";
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			return;
		}
		
		System.out.println(result + " 메뉴입니다.");
		sc.close();
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		sc.close();
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if((kor >= 40) && (math >= 40) && (eng >= 40) && (avg >= 60)){
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
			
		}else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		System.out.print(month);
		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("월은 봄입니다.");
			break;
		case 6 :
		case 7 : 
		case 8 :
			System.out.println("월은 여름입니다.");
			break;
		case 9 : 
		case 10 :
		case 11 :
			System.out.println("월은 가을입니다.");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("월은 겨울입니다.");
			break;
		default :
			System.out.println("월은 잘못 입력된 달입니다.");
			break;
		}
		sc.close();
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals("myId")) {
			if(pw.equals("myPassword12")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc.close();
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자" :
			System.out.print("회원관리, 게시글 관리 ");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성 ");
		case "비회원" :
			System.out.println("게시글 조회");
		}
		sc.close();
	}

}