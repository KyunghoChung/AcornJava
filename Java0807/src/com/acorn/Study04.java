package com.acorn;

import java.util.Scanner;

public class Study04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			수업 자료(7page)에서 if문으로 되어있는 
//			봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요
		int iMonth = sc.nextInt();
		
		if( (iMonth >= 3) && (iMonth <= 6)) {
			System.out.println(iMonth + "월은 봄입니다");
		} else if( (iMonth >= 7) && (iMonth <= 8)) {
			System.out.println(iMonth + "월은 여름입니다");
		} else if( (iMonth >= 9) && (iMonth <= 11)) {
			System.out.println(iMonth + "월은 가을입니다");
		} else if( (iMonth == 12) || (iMonth <= 2)) {
			System.out.println(iMonth + "월은 겨울입니다");
		} else {
			System.out.println(iMonth + "월은 잘못 입력된 달입니다");
		}
	}

}
