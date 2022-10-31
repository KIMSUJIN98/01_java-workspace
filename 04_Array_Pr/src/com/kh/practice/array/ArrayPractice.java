package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		// 배열 선언
		int[] arr = new int[10];
		
		// 값 대입
		for(int i =0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// 배열 출력
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public void practice2() {
		// 배열 선언
		int[] arr = new int[10];
		
		// 값 대입 (역순으로)
		for(int i =0; i<arr.length; i++) {
			arr[i] = 10 - i;
		}
		
		// 배열 출력 (똑바로)
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력 받기
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		// 배열 선언 및 할당
		int[] arr = new int[num];
		
		// 값 대입
		for(int i =0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// 배열 출력
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public void practice4() {
		// 배열 생성 및 값 대입
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		
		// 귤 일때만 출력
		for(int i =0; i<fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
			}
		}
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	
	public void practice5_1() {
		// 문자열 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 배열 생성
		char[] str1 = new char[str.length()];
		
		// 값 대입
		for(int i =0; i<str1.length; i++) {
			str1[i] = str.charAt(i);
		}
		
		// 찾으려고 하는 문자입력
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 인덱스 찾기 + count
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i=0; i<str1.length; i++) {
			if(str1[i] == ch) {
				System.out.print(i + " ");
				count ++;
			}
		}
		System.out.println();
		System.out.println(ch + "개수 : " + count);
		
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		char[] day = {'월','화','수','목','금','토','일'};
		
		if(num>=0 && num<=6) {
			System.out.println(day[num] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	
	public void practice6_1() {
		Scanner sc = new Scanner(System.in);
		// 배열 생성 및 초기화
		String[] days = {"월","화","수","목","금","토","일"};
		// 숫자 입력
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		// 출력조건 설정 및 출력
		if(num < 0 || num > 6) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		for(int i =0; i<days.length; i++) {
			if(num == i) {
				System.out.println(days[i] + "요일");
			}
		}
		
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int[] index = new int[5];
		
		System.out.print("배열 0번쨰 인덱스에 넣을 값 : ");
		index[0] = sc.nextInt();
		System.out.print("배열 1번쨰 인덱스에 넣을 값 : ");
		index[1] = sc.nextInt();
		System.out.print("배열 2번쨰 인덱스에 넣을 값 : ");
		index[2] = sc.nextInt();
		System.out.print("배열 3번쨰 인덱스에 넣을 값 : ");
		index[3] = sc.nextInt();
		System.out.print("배열 4번쨰 인덱스에 넣을 값 : ");
		index[4] = sc.nextInt();
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = index[i];
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총 합 : " + sum);
		
	}
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if((num >= 3) && (num % 2 == 1)) {
				int[] arr = new int[num];
				
				for(int i =0; i<(arr.length/2); i++) {
					System.out.print(arr[i] + " ");
				}
				for(int i = (arr.length/2); i == 0; i--) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				return;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String[] arr = {"양념","불닭","간장","후라이드","뿌링클"};
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i].equals(name)) {
				System.out.println(name + "치킨 배달 가능");
				{
					System.out.println(name + "치킨은 없는 메뉴입니다.");
				}
			
			}
		}
	}
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		
		char[] origin = idNum.toCharArray();
		char[] copy = Arrays.copyOf(origin, 14);
		
		for(int i =0; i<8; i++) {
			System.out.print(copy[i]);
		}
		System.out.print("******");
		System.out.println();
		
	}
	
	
	public void practice10_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		
		//원본배열
		char[] arr = new char[idNum.length()];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = idNum.charAt(i);
		}
		
		//복사본 배열
		char[] arrCopy = arr.clone();
		
		/*
		arrCopy[8] = '*';
		arrCopy[9] = '*';
		arrCopy[10] = '*';
		arrCopy[11] = '*';
		*/
		
		for(int i =8; i<arrCopy.length; i++) {
			arrCopy[i] = '*';
		}
		
		for(int i =0; i<arrCopy.length; i++) {
			System.out.print(arrCopy[i]);
		}
	}
	
}
