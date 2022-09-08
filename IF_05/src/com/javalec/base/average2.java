package com.javalec.base;

import java.util.Scanner;

public class average2 {

	public static void main(String[] args) {
		// 선언문
		Scanner scanner = new Scanner(System.in);
		int a1;
		
		// Logic
		System.out.println("** 학점 관리 **");
		System.out.print(">점수를 입력하세요 : ");
		a1 = scanner.nextInt();

		if ((a1 > 100) || (a1 < 0)) {
			System.out.println("error");
		} else if (a1 >= 90) {
			System.out.println("귀하는 A학점 입니다.");
		} else if (a1 >= 80) {
			System.out.println("귀하는 B학점 입니다.");
		} else if (a1 >= 70) {
			System.out.println("귀하는 C학점 입니다.");
		} else if (a1 >= 60) {
			System.out.println("귀하는 D학점 입니다.");
		} else if (a1 >= 60) {
			System.out.println("귀하는 D학점 입니다.");
		} else {
			System.out.println("귀하는 F학점 입니다.");

			System.out.println("--학점 기준--");
			System.out.println("A:90점 이상");
			System.out.println("B:80점 이상");
			System.out.println("C:70점 이상");
			System.out.println("D:60점 이상");
			System.out.println("F:59점 이하");

		}
	}

}
