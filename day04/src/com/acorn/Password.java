package com.acorn;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// 정수를 이용해서 4자리 비밀번호 만들기
		// 4자리 정수를 입력받아 각 자리 수에 중복되는 값이 없을 경우 '생성 성공'
		// 중복 값이 있으면 '중복 값 있음'
		// 자리 수가 안 맞으면 '자리 수 안 맞음' 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		String pw = sc.next();
		
		pw_check(pw);
		
		sc.close();

	}

	public static void pw_check(String pw) {
		
		if(pw.length() != 4)
			System.out.println("자리 수 안 맞음");
		else {
			boolean match = false;
			
			for (int i = 0; i < 4; i++) {
	            for (int j = i + 1; j < 4; j++) {
	                if (pw.charAt(i) == pw.charAt(j)) {
	                    match = true;
	                    break;
	                }
	            }
	        }
			if (match == true)
				System.out.println("중복 값 있음");
			else
				System.out.println("성공");
		}
	}
	
}
