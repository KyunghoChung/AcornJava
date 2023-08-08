package com.acorn;

import java.util.Scanner;

public class Study08 {

	public static void main(String[] args) {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = i;
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
