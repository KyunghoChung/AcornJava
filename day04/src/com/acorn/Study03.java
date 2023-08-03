package com.acorn;

import java.util.Scanner;
public class Study03 {
    public static void main(String[] args) {
//        // 배열(길이가 10)을 선언
//        int[] iArr = new int[10];
//        // 반복문을 이용하여
//        // 배열 인덱스에 넣은 후
//        // 순서대로
//        for(int i =0; i< 10 ; i++){
//            iArr[i] = i + 1;
//        }
//        // 값(부터 10)까지 출력
//        for(int i = 0; i <10 ; i++){
//            System.out.println(iArr[i]);
//        }
//        // 역순으로 배열에서 숫자 출력하기
//        int[] iArr = new int[10];
//        for(int i = 9, j =0 ; i >= 0; --i, j++){
//            iArr[j] = i + 1;
//        }
//        for(int i = 0; i <10 ; i++){
//            System.out.println(iArr[i]);
//        }
        // 문자열을 입력받아: sc.nextLine()
        // 문자 하나하나를 배열에 넣고: str.charAt(인덱스)
        // 검색할 문자를 입력받아:
        // 일치 문자열 개수: 증감 연산자
        // 출력
//        Scanner scanner = new Scanner(System.in);
//
//        // Input the string
//        System.out.print("Enter a string: ");
//        String inputString = scanner.nextLine();
//
//        // Convert the string to an array of characters
//        char[] charArray = inputString.toCharArray();
//
//        // Input the character to search for
//        System.out.print("Enter a character to search for: ");
//        char searchChar = scanner.next().charAt(0);
//
//        // Count the occurrences of the search character
//        int count = 0;
//        for (char c : charArray) {
//            if (c == searchChar) {
//                count++;
//            }
//        }
//
//        // Print the result
//        System.out.println("Number of occurrences of '" + searchChar + "' in the input string: " + count);
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the index number (0-6): ");
            int index = scanner.nextInt();

            if (index >= 0 && index < daysOfWeek.length) {
                String day = daysOfWeek[index];
                System.out.println("The day at index " + index + " is: " + day);
            } else {
                System.out.println("Invalid index. Please enter a number between 0 and " + (daysOfWeek.length - 1));
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer index.");
        }

    }
}
