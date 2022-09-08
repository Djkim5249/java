package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자의 입력값이 짝수인지 홀수인지 알려주기!
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력해주세요 : ");
		
//		System.out.println(scanner.nextInt());
//		String result = scanner.nextInt()%2==0 ? "Yes":"No";
//		System.out.println("숫자는 짝수다 Yes:No : " + result);
//		

		int num1 = scanner.nextInt();
		String result = (num1 % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("입력한 숫자는 " + result + " 입니다.");
	
		
		
	}

}
