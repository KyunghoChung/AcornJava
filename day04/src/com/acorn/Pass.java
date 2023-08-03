package com.acorn.practice;

import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		// 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져있고
		// 이 때, 출석 비율은 출석 횟수의 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		// 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간고사 점수 >> ");
		int middle_score = sc.nextInt();
		System.out.println("기말고사 점수 >> ");
		int final_score = sc.nextInt();
		System.out.println("과제 점수 >> ");
		int assign_score = sc.nextInt();
		System.out.println("출석 수 >> ");
		int attendance = sc.nextInt();
		
		practice9(middle_score, final_score, assign_score, attendance);
		
		sc.close();

	}
	
	public static void practice9(int middle_score, int final_score, int assign_score, int attendance) {
		
		double total = (middle_score * 0.2) + (final_score * 0.3) + (assign_score * 0.3) + (attendance * 0.2);
		
		if (total >= 70)
			if (attendance > 6)
				System.out.println("Pass");
			else
				System.out.println("Fail");
		else
			System.out.println("Fail");
	}

}
