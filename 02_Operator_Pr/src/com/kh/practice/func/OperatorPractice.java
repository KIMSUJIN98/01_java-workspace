package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice { // 클래스명은 대문자
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : "양수가 아니다";
		System.out.println(result);
		sc.close();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : (num == 0) ? "0이다" : "음수다";
		System.out.println(result);
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		//String result = (num % 2 != 0) ? "홀수다" : "짝수다";
		//String result = (num % 2 == 1) ? "홀수다" : "짝수다";
		
		System.out.println(result);
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남는 사탕 개수 : " + (candy % people));
		sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		/*
		 *	* 내가 작성한 코드
		 *	String result = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		 *	System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, group, num, name, result, score);
		 */
		
		gender = (gender == 'M') || (gender == 'm') ? '남' : '여'; // gender는 캐릭터형이므로 홑따옴표로 작성한다.
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.\n", grade, group, num, name, gender, score);
		//System.out.println(grade + "학년 " + group + "반 " + num + "번 " + name + " " + gender + "학생의 성적은 " + score + "이다.");
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age > 19) ? "성인" : (age > 13) ? "청소년" : "어린이";
		//String result = (age <= 13) ? "어린이" : (age > 19) ? "성인" : "청소년";
		System.out.println(result);
		sc.close();
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		//System.out.println("평균 : " + avg);
		
		String result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60) ? "합격" : "불합격";
		
		System.out.println(result);
		sc.close();
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		/*
		 *	String number = sc.nextLine();
		 *	char gender = number.charAt(7);
		 *	String result = (gender == '1') ? "남자" : "여자";
		 *	System.out.println(result);
		 *	sc.close();
		 */
		
		/*
		 * 	String number = sc.nextLine();
		 * 	String result = (number.charAt(7) == '1') ? "남자" : "여자";
		 * 	System.out.println(result);
		 * 	sc.close();
		 */
		
		char gender = sc.nextLine().charAt(7); // 주민번호, 전화번호 등 -가 포함되는 경우 String, char로 받는다.
		//System.out.println("gender 의 값 : " + gender); 을 사용하여 확인해봐도 됨.
		
		String result = (gender == '1') ? "남자" : "여자";
		//String result = (gender == '1') ? "남자" : (gender == '2') ? "여자" : "잘못입력하셨습니다"; 응용버전
		
		System.out.println(result);
		sc.close();
	}

}
