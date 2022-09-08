package com.javalec.base;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// 선언문
		Scanner scanner = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요!");
	
		int kor = scanner.nextInt();
		if ((kor > 100) || (kor < 0)){
			System.out.println("error");
		}
		
		
		System.out.println("영어 점수를 입력하세요!");
		int eng = scanner.nextInt();

		System.out.println("수학 점수를 입력하세요!");
		int math = scanner.nextInt();

		double a1 = (double) (kor + eng + math) / 3;

		if ((kor <= 100) && (kor >= 0) && (eng <= 100) && (eng >= 0) && (math <= 100) && (math >= 0)) {
			System.out.println("평균점수 : " + a1);
		}

	
		 if ((kor > a1) && (kor <= 100)) {
			System.out.println("영어 점수는 평균보다 높습니다.");
		} else if (kor == a1) {
			System.out.println("영어 점수는 평균 점수입니다.");
		} else if ((kor < a1) && (kor >= 0)) {
			System.out.println("영어 점수는 평균 점수보다 낮습니다.");
		} else {
			System.out.println("error");
		}
		

		if (eng > 100 || eng < 0) {
			System.out.println("error");
		} else if (eng > a1) {
			System.out.println("영어 점수는 평균보다 높습니다.");
		} else if (eng == a1) {
			System.out.println("영어 점수는 평균 점수입니다.");
		} else {
			System.out.println("영어 점수는 평균보다 낮습니다.");
		}

		if (math > 100 || math < 0) {
			System.out.println("error");
		} else if (math > a1) {
			System.out.println("수학 점수는 평균보다 높습니다.");
		} else if (math == a1) {
			System.out.println("수학 점수는 평균 점수입니다.");
		} else {
			System.out.println("수학 점수는 평균보다 낮습니다.");
		}

	}
}}

