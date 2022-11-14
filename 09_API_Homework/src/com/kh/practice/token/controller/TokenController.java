package com.kh.practice.token.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenController {
	
	// 기본생성자
	public TokenController() {}
	
	
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		String stn1 = "";
		while(stn.hasMoreTokens()) {
			stn1 += stn.nextToken();
		}
		return stn1;
	}
	
	
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		String stn1 = input.toUpperCase().charAt(0) + input.substring(1);
		return stn1;
	}
	
	
	public int findChar(String input, char one) {

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
	
	
	
}
