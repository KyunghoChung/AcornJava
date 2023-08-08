package com.acorn;

import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
		// 문자열을 입력 받아 문자 하나하나를(charAt) 배열에 넣고
		// 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		int check = 0;
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char c = sc.next().charAt(0);
		
		System.out.print(str + "에 " + c + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < str.length(); i++) {
			char[] cArr = new char[str.length()];
			
			cArr[i] = str.charAt(i);
			
			
			if(cArr[i] == c) {
				System.out.print(i + " ");
				check++;
			}
		}
		
		System.out.println();
		System.out.println(c + " 개수 : " + check);
		
	}
}
