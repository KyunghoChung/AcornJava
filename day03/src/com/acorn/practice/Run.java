package com.acorn.practice;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요:>>>");
        String sInputName = sc.nextLine();
        System.out.println();
        System.out.print("성별을 입력하세요(남/여):>>>");
        String sInputSex = sc.nextLine();
        System.out.println();
        System.out.print("나이 입력하세요:>>>");
        int iInputAge = sc.nextInt();
        System.out.println();
        System.out.print("키를 입력하세요:>>>");
        double dInputHeight = sc.nextDouble();
        System.out.println();

        System.out.println("키 " + dInputHeight + "cm인 " + iInputAge + "살 " + sInputSex + "자 " + sInputName + "님 반갑습니다 ^^");
    }
}
