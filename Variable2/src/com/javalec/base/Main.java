package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Data Types
		//문자형
		char char1 = 'C';
		char char2 = '가';
	
		//정수형
		int intNum1 = 10;
		int intNum2 = 20;
	
		//실수형
		double doubleNum1 = 10.0;
		double doubleNum2 = 20.0;
	
		//문자열 형
		String str1 = "apple";
		String str2 = "대한민국";
	
		//부울형
		boolean bool1 = true;		
		boolean bool2 = false;
	
			
	
	}

}


package com.javalec.base;

import java.util.Scanner;

public class IF_07 {

	public static void main(String[] args) {
		// 선언부
		// 체질량지수 = 자신의 몸무게(kg)를 키(m)의 제곱으로 나눈 값
		Scanner scanner = new Scanner(System.in);
		double height; // 키
		double weight; // 몸무게
		double bmi = 0; // bmi
		String range = ""; // 분류 범위
		
		
		// 사용자 입력내용 가져오기 : 키
		System.out.print("키(cm)를 입력해주세요 : ");
		height = scanner.nextInt();
		if(height > 300 || height < 0) {
			System.out.print("키(cm)를 다시 입력해주세요 : ");
			height = scanner.nextInt();
		}
		
		// 사용자 입력내용 가져오기 : 몸무게
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		weight = scanner.nextInt();
		if(weight > 200 || weight < 0) {
			System.out.print("몸무게(kg)를 다시 입력해주세요 : ");
			weight = scanner.nextInt();
		}
		
		// bmi 걔산하기
		bmi = weight / ((height / 100) * (height / 100));
		
		// 분류 범위 설정하기
		if(bmi >= 30) {
			range = "고도비만";
		}else if(bmi >= 25){
			range = "비만";
		}else if(bmi >= 23){
			range = "과체중";
		}else if(bmi > 18.5){
			range = "정상체중";
		}else if(bmi > 0){
			range = "저체중";
		}
		
		// 결과출력부
		System.out.println("귀하의 BMI는 " + bmi + "이며, " + range + "입니다.");
		
		
	}

}
