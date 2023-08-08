package com.acorn;

public class Study07 {

	public static void main(String[] args) {
		// 길이가 10인 배열 선언
		// 반복문을 이용하여 1부터 10까지 값을 순서대로 배열에 저장
		// 값 출력
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// 길이가 10인 배열 선언
		// 반복문을 이용하여 1부터 10까지 값을 역순으로 저장
		// 값 출력

		int[] arrRev = new int[10];
		
		for(int i = 0; i < 10 ; i++) {
			arrRev[i] = 10 - i;
			System.out.print(arrRev[i] + " ");
		}
	}

}
