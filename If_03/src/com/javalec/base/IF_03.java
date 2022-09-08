package com.javalec.base;

import java.util.Scanner;

public class IF_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 10;
//		int j = 20;
//		
//		if(i > j) {
//			System.out.println("i는 j보다" + (i-j) + "만큼 큽니다.");
//		} else if(i<j) {
//			System.out.println("j는 i보다" + (j-i) + "만큼 큽니다.");
//		} else {
//			System.out.println("i와 j는 동일합니다.");
//		}
//		
//		System.out.println("계산이 완료되었습니다.");
//		
		// 선언부
		Scanner scanner = new Scanner(System.in);
		int inputNum1; // 금액

		System.out.print("금액을 입력하세요 : ");
		inputNum1 = scanner.nextInt();

		if (inputNum1 > 8000) {
			System.out.println("너무 비쌉니다.");
		}

		else if (inputNum1 > 5000) {
			System.out.println("조금 비쌉니다.");
		}

		else if (inputNum1 > 3000) {
			System.out.println("적당한 금액입니다.");

		} else {
			System.out.println("싼 편입니다.");
		}
	} // Main

}
// IF_03
