package com.kh.practice.token.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenController {
	
	// 기본생성자
	public TokenController() {}
	
	
	public String afterToken(String str) {
		
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여 띄어쓰기를 없애고
		StringTokenizer stn = new StringTokenizer(str, " ");			// str이 공백을 기준으로 하나씩 나누어져 토큰에 담긴다.
		
		/*
		String stn1 = "";
		while(stn.hasMoreTokens()) {
			stn1 += stn.nextToken();
		}
		
		// 없앤 문자열 반환
		return stn1;
		*/
		
		int count = stn.countTokens(); // 11
		String newStr = "";
		
		for(int i =0; i<count; i++) {
			newStr += stn.nextToken();
		}
		return newStr;
	}
	
	
	public String firstCap(String input) {
		
		/*
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		String stn1 = input.toUpperCase().charAt(0) + input.substring(1);
		return stn1;
		*/
		
		String upper = input.substring(0, 1).toUpperCase();
		String lower = input.substring(1).toLowerCase();
		return upper + lower;
	}
	
	
	public int findChar(String input, char one) {
		
		/*
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
		*/
		
		
		/*
		char[] arr = input.toCharArray();
		int count = 0;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		
		return count;
		*/
		
		
		String sOne = one + "";
		char arr[] = input.toCharArray();
		int count = 0;
		
		for(int i =0; i<arr.length; i++) {
			char ch = arr[i];
			String str = ch + "";
			
			if(str.contains(sOne)) {
				count++;
			}
		}
		return count;
		
	}
		
	
}
