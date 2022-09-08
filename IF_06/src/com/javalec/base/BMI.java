package com.javalec.base;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// 선언문
	Scanner scanner = new Scanner(System.in);
	int h1;
	int w1;
	double h2;
	double bmi;
	String result = "";
	
	//	logic
	System.out.print("당신의 키(cm)는? : ");
	h1 = scanner.nextInt();
	System.out.print("당신의 몸무게(kg)는? : ");
	w1 = scanner.nextInt();
	
	h2 = h1 * 0.01;
	System.out.println("");
	bmi = w1 / (h2 * h2);
	
	System.out.println("당신의 BMI 지수는 " + bmi + "입니다.");
	
	
	
	if (bmi>=30) {
		result = "고도비만입니다.";
	}
	else if (bmi>=25) {
		result = "비만입니다.";
	}
	else if (bmi>=23) {
		result = "과체중입니다.";
	}
	else if (bmi>=18.5) {
		result = "정상체중입니다.";
	}
	else {
		result = "저체중입니다.";
	}
	
	System.out.println("당신은 " + result);
	
			
			
	
			

	}

}
