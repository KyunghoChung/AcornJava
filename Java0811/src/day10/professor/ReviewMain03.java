package day10.professor;

import java.util.Scanner;

public class ReviewMain03 {

    public static void main(String[] args) {
        // 입력된 네 개의 수가 있습니다.
        Scanner sc = new Scanner(System.in);
        // 두 개는 실수, 두 개는 정수
        int iA, iB, iC;
        System.out.print("정수를 입력:>>> ");
        iA = sc.nextInt();
        System.out.print("정수를 입력:>>> ");
        iB = sc.nextInt();
        System.out.print("정수를 입력:>>> ");
        iC = sc.nextInt();

        // 세 개 중 하나라도 5보다 작은 수가 출력
        if(iA < 5) {
            System.out.println(iA + "는 5보다 작은 수 입니다.");
        } else if(iB < 5) {
            System.out.println(iA + "는 5보다 작은 수 입니다.");
        } else if(iC < 5) {
            System.out.println(iA + "는 5보다 작은 수 입니다.");
        } else { System.out.println("5보다 작은 수가 없습니다."); }
    }


}