package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 선언부
		Scanner scanner = new Scanner(System.in); // Scanner 정의
		int inputNum1; // 첫번째 숫자
		int inputNum2; // 두번째 숫자
		String result = ""; // 결과값 멘트

		// 사용자 입력내용 가져오기
		System.out.print("첫번째 숫자를 입력하세요 : ");
		inputNum1 = scanner.nextInt();

		System.out.print("두번째 숫자를 입력하세요 : ");
		inputNum2 = scanner.nextInt();

		// 두수 비교하여 출력하기
		System.out.println("");
		System.out.println("<Result>");

		if (inputNum1 > inputNum2) {
			result = "보다 큽니다.";
		}

		else if (inputNum1 < inputNum2) {
			result = "보다 작습니다.";
		}

		else {
			result = "와 같습니다.";

		}
		System.out.println("첫번째 숫자가 두번째 숫자" + result + "\nthank you");

	}

}
