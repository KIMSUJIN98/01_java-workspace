package com.kh.run;

public class BubbleSortRun {

	public static void main(String[] args) {
		int[] arr = {22,99,30,68,87,1,13};
		int temp = 0; 																// 비교를 위한 임시 저장용 변수
		
		for(int i=0; i<arr.length; i++) {		 	// 사이클이 돌아가는 for
			for(int j=1; j<arr.length; j++) { 		// 자기들끼리 돌아가는 for
				if(arr[j-1] > arr[j]) {				// 앞의 숫자가 뒤의 숫자보다 큰 경우  	// arr[j-1] = 3, arr[j] = 0
					temp = arr[j-1]; 				// temp에 더 큰 숫자를 보관  			// temp = arr[j-1] = 3
					arr[j-1] = arr[j]; 				// 더 작은 숫자를 앞으로 보내기			// arr[j-1] = arr[j] = 0
					arr[j] = temp; 					// temp에 저장한 숫자를 뒤로 보내기		// arr[j] = temp = 3
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}

}
