package com.kh.array;

public class A_Array {
	// 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	// int a= 10, 20, 30, 40; 불가능
	
	// 배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념
	//		 "같은 자료형의 값" 으로만 담을 수 있다.
	//		 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작!!)
	public void method1() {
		
		// * 배열을 왜 쓰는지?
		
		/*
		 *  변수라는 것만을 이용하게 되면 => 대량의 데이터들을 보관하고자 할 때 각각의 변수를 만들어서 따로 관리
		 *  
		
		// int num1 = 0, 1, 2, 3, 4;
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 출력하고자 할 때도 => 일일히 출력해야됨
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 이거 안된다,
		/*
		for(int i =1; i<=5; i++) {
			System.out.println(num + i); // 애초에 numi, num + i등 표현할 방법이 없음
		}
		
		
		//총합계를 구할 때도 => 일일히 더해줘야됨 (반복문 활용 불가)
		int sum = num1 + num2 + num3 + num4+ num5;
		
		*/
		
		/*
		 * 1. 배열 선언(여러개의 값을 보관할 배열을 만들겠다!!)
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형[] 배열명; => 저는 이걸로 갑니다
		 */
		
		int a; // 변수 선언
		
		//int arr[]; // 가능하지만 아래의 표현법을 사용하겠다
		//int[] arr; // 오로지 int값만 담을 수 있다!!
		
		/*
		 * 2. 배열 할당(크기지정) => 이 배열에 몇개의 값들을 보관할껀지 크기를 지정하는 과정// 방만들기
		 * 	  배열명 = new 자료형[배열크기];
		 */
		
		//arr = new int[5];
		
		// *** 배열 선언과 동시에 할당 (배열 만듦과 동시에 크기 지정)
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입
		 * 	  배열명[인덱스] = 값;
		 */
		
		// 이거 반복문으로 써보는거 어떨까?
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열 장점 : 반복문 활용 가능!!
		for(int i =0; i<=4; i++) {
			arr[i] = i;
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		for(int i =0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 실제 arr이라는 박스에는 "주소값" 이라는게 담겨있음
		
		
	}
	
	
	public void method2() {
		int i = 10;
		
		// 배열 선언과 동시에 할당
		//iArr => 5 int형
		int[] iArr = new int[5];
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 리터럴값을 곧바로 담을 수 있는 변수는 일반 변수라고 얘기하고 //리터럴값 : 눈에 바로 보이는 값
		 * 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)라고 한다.
		 * 
		 * 기본자료형 (boolean, char, byte, short, int, long, float, double)으로 선언한 변수
		 * => 실제 리터럴값을 바로 담는 변수 => 일반변수 //특징 : 소문자로 시작하여 소문자로 끝남
		 * 
		 * 그 외 자료형(String, int[], double[], char[], short[], ....) 으로 선언된 변수
		 * => 주소값을 담는 변수 => 참조변수 //String이 == 비교 연산자가 불가능했던 이유
		 */
	}
	
	
	public void method3() {
		int[] iArr = new int[3]; //0번 ~ 2번 인덱스
		double[] dArr = new double[4]; //0번 ~ 3번 인덱스
		
		for(int i=0; i<3; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("====================");
		for(int i=0; i<4; i++) {
			System.out.println(dArr[i]);
		}
		
		// 내가 간 인덱스에 초기화를 하지 않아도 값들이 담겨있음! 왜?
		// Heap이라는 공간에 절대 빈공간이 존재할 수 없음!!
		// 따라서 공간이 만들어질때 JVM이 기본적으로 초기화(대입)을 진행해줌 // 자료형에 맞추어 0과 0.0을 대입
	
	}
	
	
	public void method4() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 */
		
		// for 값 대입 + for 값 출력
		for(int i=0; i<5; i++) {
			arr[i] = i + 1;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 배열의자료형 + @ + 주소값 16진수
		System.out.println(arr.hashCode()); // 주소값의 10진수 형태
		
		
	}


}
