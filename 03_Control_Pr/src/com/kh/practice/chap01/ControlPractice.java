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
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if((BMI >= 18.5) && (BMI < 23)) {
			System.out.println("정상체중");
		}else if((BMI >= 23) && (BMI < 25)) {
			System.out.println("과체중");
		}else if((BMI >= 25) && (BMI < 30)) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
		
		sc.close();
	}
	
	
	public void practice8() {
		/*
		 * 입력은 두 개의 정수로 받아야 한다.
		 * 계산된 출력 값은 소수 둘째자리까지 나타낸다. 이때, 나머지를 버리지 않는다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		char op = sc.nextLine().charAt(0);
		
		if((num1 > 0) && (num2 > 0)) {
			switch(op) {
			case '+' :
				System.out.printf("%d + %d = %.2f\n", num1, num2, ((double)(num1) + (double)(num2)));
				break;
			case '-' :
				System.out.printf("%d - %d = %.2f\n", num1, num2, ((double)(num1) - (double)(num2)));
				break;
			case '*' :
				System.out.printf("%d * %d = %.2f\n", num1, num2, ((double)(num1) * (double)(num2)));
				break;
			case '/' :
				System.out.printf("%d / %d = %.2f\n", num1, num2, ((double)(num1) / (double)(num2)));
				break;
			case '%' :
				System.out.printf("%d % %d = %.2f\n", num1, num2, ((double)(num1) % (double)(num2)));
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				break;
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		sc.close();
	}
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid_exam = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int final_exam = sc.nextInt();
		System.out.print("과제  점수 : ");
		int homework = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();
		System.out.println("================= 결과 =================");
		
		double mid_rate = mid_exam * 0.2; // 중간 고사 점수(20)
		double fin_rate = final_exam * 0.3; // 기말 고사 점수(30)
		double hw_rate = homework * 0.3; // 과제 점수		(30)
		double sum = mid_rate + fin_rate + hw_rate + attend; // 총점
		
		if(attend > 14) {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mid_rate);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fin_rate);
			System.out.printf("과제 점수		(30) : %.1f\n", hw_rate);
			System.out.printf("출석 점수		(20) : %.1f\n", (double)(attend));
			System.out.printf("총점 : %.1f\n", sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
			
		}else {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]\n", attend);
		}
		
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int method = sc.nextInt();
		
		switch(method) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
			break;
		case 8 :
			practice8();
			break;
		case 9 :
			practice9();
			break;
		default:
			System.out.println("입력이 잘못되었습니다.");
			break;
		}
		sc.close();
	}

}
