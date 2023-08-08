package com.acorn;

import java.util.Scanner;

public class Study06 {

	public static void main(String[] args) {
		// 사용자로부터 1보다 큰 한 개의 값을 입력 받아
		// 1부터 입력한 수까지 거꾸로 출력
		// 1 미만의 수가 입력되면
		// "1이상의 숫자를 입력해주세요"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		
		if (inputNum < 1)
			System.out.println("1이상의 숫자를 입력해주세요");
		else {
//			for(int i = inputNum; i >= 1; i--)
//				System.out.print(i + " ");
			
			for(int i = 0; i < inputNum; i++)
				System.out.print((inputNum - i) + " ");
		}
		
		sc.close();
	}

}