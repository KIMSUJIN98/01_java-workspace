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
		
		for(int i =0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
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
	
	
	//강사님 코드
	public void practice7_1() {
		
		// 배열 길이 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		// 배열 생성 및 할당
		int[] arr = new int[num];
		
		// 값대입 (초기화)
		for(int i =0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		// 출력 누적합 구하기
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			// 누적합 공식
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if((num % 2 == 0) || (num < 3)) {
				System.out.println("다시 입력하세요");
			}else {
				int[] arr = new int[num];
				
				for(int i =0; i<arr.length; i++) {
					if(i < arr.length/2) {
						arr[i] = i + 1;
					}else {
						arr[i] = arr.length - i;
					}
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				return;
			}
			
		}
	}
	
	
	//강사님 코드
	public void practice8_1() {
		Scanner sc = new Scanner(System.in);
		
		// 조건이 맞을때까지 반복 => while문
		while(true) { //무한반복
			// 정수입력
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { //num이 3이상 이면서(&&) 홀수일때만 작동
				int[] arr = new int[num];
				
				/*
				 * 5입력시 => {1, 2, 3, 2, 1}				=> 2번 인덱스까지 증가 그 이후부터 감소
				 * 7입력시 => {1, 2, 3, 4, 3, 2, 1}		=> 3번 인덱스까지 증가 그 이후부터 감소
				 * 9입력시 => {1, 2, 3, 4, 5, 4, 3, 2, 1}	=> 4번 인덱스까지 증가 그 이후부터 감소
				 */
				
				// 값 대입
				int value = 1;
				for(int i =0; i<arr.length; i++) {
					arr[i] = value;
					if(i<arr.length/2) {
						value++; //무작정 value++ 를 해주면 안되겠구나
					}else {
						value--;
					}
				}
				
				for(int i =0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				return;
				
			}else { // 아닌경우 다시 입력하게 한다.
				System.out.println("다시 입력하세요.");
			}
		}
	}

	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();

		String[] arr = { "양념", "불닭", "간장", "후라이드", "뿌링클" };

		if (arr[0].equals(name)) {
			System.out.println(name + "치킨 배달 가능");
		} else if (arr[1].equals(name)) {
			System.out.println(name + "치킨 배달 가능");
		} else if (arr[2].equals(name)) {
			System.out.println(name + "치킨 배달 가능");
		} else if (arr[3].equals(name)) {
			System.out.println(name + "치킨 배달 가능");
		} else if (arr[4].equals(name)) {
			System.out.println(name + "치킨 배달 가능");
		} else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice9_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();

		String[] arr = { "양념", "불닭", "간장", "후라이드", "뿌링클" };

		for(int i =0; i<arr.length; i++) {
			if(arr[i].equals(name)) {
				System.out.println(arr[i] + "치킨 배달 가능");
				return;
			}	
		}
		System.out.println(name + "치킨은 없는 메뉴입니다.");
		return; // 생략가능
	}
	
	
	// 강사님 코드
	public void practice9_2() {
	      Scanner sc = new Scanner(System.in);
	      // 배열 생성
	      String[] chickens = { "황금올리브", "허니콤보", "뿌링클", "고추바사삭" };

	      System.out.print("치킨 이름을 입력하세요 : ");
	      String chicken = sc.nextLine();

	      int count = 0;
	      for (int i = 0; i < chickens.length; i++) {
	         if (chicken.equals(chickens[i])) {
	            count ++;
	         }
	      }
	      if(count == 1) {
	         System.out.println(chicken + "치킨 배달 가능");
	      }else {
	         System.out.println(chicken + "치킨은 없는 메뉴입니다.");
	      }
	   }
	
	
		
	public void practice9_3() {
		Scanner sc = new Scanner(System.in);
		
		// 치킨 메뉴를 배열로 설정
		String[] menu = { "양념", "불닭", "간장", "후라이드", "뿌링클" };
		System.out.print("치킨 이름을 입력하세요 : ");
		String pick = sc.nextLine();
		boolean result = false; // 사용자 입력값에 따라 일치하면 true! 일치하지 않으면 false!

		// 치킨값 대입
		for (int i = 0; i < menu.length; i++) {
			if (pick.equals(menu[i])) { // 치킨메뉴 배열값이 메뉴안에 있으면
				System.out.println(pick + "치킨 배달 가능");
				result = true;
			}
		}

		if (result == false) {
			System.out.println(pick + "치킨은 없는 메뉴입니다.");
		}

	}
	
	
	public void practice9_4() {
		 Scanner sc = new Scanner(System.in);
         System.out.print("치킨 이름을 입력하세요 : ");
         String str = sc.nextLine();
         String[] arr = { "후라이드", "양념", "간장", "파" ,};
         for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
               System.out.println(str + "치킨 배달 가능");
               break;
            } else if (i == arr.length - 1) { // arr[3]까지 다 돌았을 때 없다는걸 의미한다.
               System.out.println(str + "치킨은 없는 메뉴입니다.");
            }
         }
	}
	
	
	/*
	 * break는 반복문을 빠져나옴
	 * return은 메소드 자체를 빠져나옴
	 */
	
	
	public void practice9_5() { // 9_3과 유사한 코드
		Scanner sc = new Scanner(System.in);
		String[] chix = { "뿌링클", "간장", "양념", "호박" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		boolean result = false;

		for (int i = 0; i < chix.length; i++) {
			if (chix[i].equals(chicken)) {
				result = true;
				break;
			}
		}
		if (result) {
			System.out.print(chicken + "치킨 배달 가능");
		} else {
			System.out.print(chicken + "치킨은 없는 메뉴입니다");
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
	
	
	public void practice11() {
		// 배열 선언 및 할당 => 크기 10으로
		int[] arr = new int[10];
		
		// 값 대입 => 초기화
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		}
		// 배열 출력
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice11_1() {
		// 배열 선언 및 할당 => 크기 10으로
		int[] arr = new int[10];
		//int random = (int)(Math.random()*10 + 1); // for문 밖에서 random 값을 선언할 경우, 값이 고정되버린다.
		
		// 값 대입 => 초기화
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random()*10 + 1);
			arr[i] = random;
		}
		// 배열 출력
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice12() {
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		}
		
		int max = 1;
		int min = 10;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}else if(arr[i] <= min){
				min = arr[i];
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	
	//강사님 코드
	public void practice12_1() {
		//배열 선언 및 할당
		int[] arr = new int[10];
		
		//값대입 => 초기화
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random() *10 + 1);
			arr[i] = random;
		}
		
		//출력!! (최대값, 최소값)
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	//강사님 코드
	public void practice12_2() {
		// 배열 생성 및 할당
		int[] arr = new int[10];
		
		// 값 대입 (초기화) : 랜덤값(난수) : 1~10
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random() *10 + 1);
			arr[i] = random;
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		
		Arrays.sort(arr); // 작은수부터 큰수까지 정렬해주는 함수 : 오름차순으로 순차적 정렬
		
		/*
		 * 오름차순정렬 여부를 확인하는 코드
		 
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		
		min = arr[0];
		max = arr[arr.length-1];
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	
	//강사님 코드 : 이해 필요(패스 or 암기)
	public void practice13() {
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			for(int j =0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice14() {
		int[] lotto = new int[6];
		
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*100 + 1);
			if (lotto[i] < 1 || lotto[i] > 45) {
				i--;
			}else {
				for(int j =0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
					}
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
	//강사님 코드
	public void practice14_1() {
		// 1~45 : 랜덤한 난수
		// 중복없이 => 이중 for문
		// Arrays.sort()
		// 로또는 6개 int[] lotto
		
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
	/*
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();
		System.out.print("문자열에 있는 문자 : ");

		boolean result = true;

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (ch[i] == ch[j]) {
					result = false;
				}
			}

			if (result = true) {
				count++;
				System.out.print(ch[i]);
				if (i < str.length() - 1) {
					System.out.print(", ");
				}
			}
		}

		System.out.println();
		System.out.println("문자 개수 : " + count);

	}
	*/
	

	//강사님 코드
	public void practice15_1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine(); //apple
		
		char[] arr = new char[str.length()];
		int count = 0; // 개수를 위한 변수 셋팅
		
		System.out.print("문자열에 있는 문자 : ");

		// 값대입 for문
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

			boolean flag = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
				}
			}

			if (flag) { // flag가 true라는 의미
				if (i ==0) {
					System.out.print(arr[i]);
				}else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
		 
		
	}
	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		char ch = sc.nextLine().charAt(0);

		while (true) {
			if ((ch == 'y') || (ch == 'Y')) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num1 = sc.nextInt();
				sc.nextLine();
				num += num1;

				arr = new String[num];

				for (int i = num - num1; i < arr.length; i++) {
					System.out.print((i + 1) + "번째 문자열 : ");
					arr[i] = sc.nextLine();
				}
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				ch = sc.nextLine().charAt(0);
				if((ch == 'n') || (ch == 'N')) {
					System.out.print("[");
					for (int i = 0; i < arr.length; i++) {
						if (i == 0) {
							System.out.print(arr[i]);
						} else {
							System.out.print(", " + arr[i]);
						}
					}
					System.out.print("]");
					return;
				}
			} 
			
			else if ((ch == 'n') || (ch == 'N')) {
				System.out.print("[");
				for (int i = 0; i < arr.length; i++) {
					if (i == 0) {
						System.out.print(arr[i]);
					} else {
						System.out.print(", " + arr[i]);
					}
				}
				System.out.print("]");
				return;
			}
		}

	}
		

	/*
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[num];
		
		for(int i =0; i<arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		
		if((ch == 'y')||(ch == 'Y')) {
			System.out.print("더 입력하고 싶은 개수 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			num += num1;
			
			arr = new String[num];
			
			for(int i =num-num1; i<arr.length; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				arr[i] = sc.nextLine();
			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			ch = sc.nextLine().charAt(0);
			
			
		}else if((ch == 'n')||(ch == 'N')) {
			System.out.print("[");
			for(int i =0; i<arr.length; i++) {
				if(i == 0) {
					System.out.print(arr[i]);
				}else {
					System.out.println(", " + arr[i]);
				}
			}
			System.out.print("]");
		}
	}
	*/

}
