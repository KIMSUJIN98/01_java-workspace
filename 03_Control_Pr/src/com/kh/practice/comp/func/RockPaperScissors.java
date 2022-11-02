package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	
	public void rps(){
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		int total = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) {
			System.out.print("가위바위보 : ");
			String person = sc.nextLine();
			String exit = "exit";
			
			if(person.equals(exit)) {
				System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");
				return;
			} else if(!(person.equals("가위") || person.equals("바위") || person.equals("보"))) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}
			
			total++;
			
			String com = "";
			
			int random = (int)(Math.random()*3 + 1);
			switch(random) {
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			default:
				com = "보";
			}
			
			System.out.println("컴퓨터 : " + com);
			System.out.println(name + " : " + person);
			
			if(com.equals(person)) {
				draw++;
				System.out.println("비겼습니다");
			}else {
				if((com.equals("바위") && person.equals("보")) || (com.equals("가위") && person.equals("바위")) || (com.equals("보") && person.equals("가위"))) {
					win++;
					System.out.println("이겼습니다 !");
				} else {
					lose++;
					System.out.println("졌습니다 ㅠㅠ");
				}
			}
			System.out.println();
			
		}
	}
	
	/*
	 * 강사님 코드
	 * 
	public void rps() {
	      Scanner sc = new Scanner(System.in);
	      int total = 0; // 전
	      int win = 0; // 승
	      int lose = 0;// 패
	      int tie = 0; // 무

	      System.out.print("당신의 이름을 입력해주세요 : ");
	      String name = sc.nextLine();

	      while (true) {
	         System.out.print("가위바위보 : ");
	         String rps2 = sc.nextLine();

	         int random = (int) (Math.random() * 3 + 1); // 1 2 3
	         String rps = " ";

	         switch (random) {
	         case 1:
	            rps = "가위";
	            break;

	         case 2:
	            rps = "바위";
	            break;

	         default: // 1도 2도 아닌 경우
	            rps = "보";
	            break;
	         }

	         if (rps2.equals("exit")) { // 종료
	            System.out.println(total + "전 " + win + "승 " + tie + "무 " + lose + "패");
	            return;
	         } else if (rps2.equals("가위") || rps2.equals("바위") || rps2.equals("보")) {
	            total++;

	            System.out.print("컴퓨터 : ");
	            System.out.println(rps);
	            System.out.print(name + " : ");
	            System.out.println(rps2);

	            if (rps.equals("가위")) {

	               switch (rps2) {
	               case "가위":
	                  System.out.println("비겼습니다.");
	                  tie++;
	                  break;
	               case "바위":
	                  System.out.println("졌습니다 ㅠㅠ.");
	                  lose++;
	                  break;
	               case "보":
	                  System.out.println("이겼습니다 !");
	                  win++;
	                  break;
	               }
	               System.out.println();

	            } else if (rps.equals("바위")) {
	               switch (rps2) {
	               case "가위":
	                  System.out.println("졌습니다 ㅠㅠ.");
	                  lose++;
	                  break;
	               case "바위":
	                  System.out.println("비겼습니다.");
	                  tie++;
	                  break;
	               case "보":
	                  System.out.println("이겼습니다 !");
	                  win++;
	                  break;
	               }
	               System.out.println();
	            } else if (rps.equals("보")) {
	               switch (rps2) {
	               case "가위":
	                  System.out.println("이겼습니다 !");
	                  win++;
	                  break;
	               case "바위":
	                  System.out.println("졌습니다 ㅠㅠ.");
	                  lose++;
	                  break;
	               case "보":
	                  System.out.println("비겼습니다.");
	                  tie++;
	                  break;
	               }
	               System.out.println();
	            }

	         } else { // 잘못입력한경우
	            System.out.println("잘못 입력하셨습니다.");
	            System.out.println();
	         }
	      }
	   }
	   */

}