package day10.review;

import java.util.*;
public class ReviewMain {
    public static void main(String[] args) {
//        // 변수
        // 실습1
//        // 정수 변수 두 개 선언
//        int num1, num2, num3;
//        // 선언된 세 개의 변수 중 두 번째 변수를 임의의 값으로 초기화
//        num2 = 811;
//        System.out.println(num1, num2, num3);
        // 실습2
        // 입력된 네 개의 수/두 개는 정수, 두 개는 실수
        // 숫자들을 검사해서 5보다 작은 수를 출력

        Scanner sc = new Scanner(System.in);
        // 실습 5부터 삭제
//        int a, b;
//        int c, d;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 번째 정수 입력: ");
//        a = sc.nextInt();
//        System.out.print("두 번째 정수 입력: ");
//        b = sc.nextInt();
//        System.out.print("세 번째 정수 입력: ");
//        c = sc.nextInt();


//        System.out.print("첫 번째 실수 입력: ");
//        c = sc.nextDouble();
//        System.out.print("두 번째 실수 입력: ");
//        d = sc.nextDouble();
//        if(a < 5){
//            System.out.printf("%d은/는 5보다 작습니다.", a);
//        }
//        else{
//            System.out.printf("%d은/는 5보다 큽니다.", a);
//        }
//        System.out.println(" ");
//        if(b < 5){
//            System.out.printf("%d은/는 5보다 작습니다.", b);
//        }
//        else{
//            System.out.printf("%d은/는 5보다 큽니다.", b);
//        }
//        System.out.println(" ");
//        if(c < 5){
//            System.out.printf("%.1f은/는 5보다 작습니다.", c);
//        }
//        else{
//            System.out.printf("%.1f는 5보다 큽니다.", c);
//        }
//        System.out.println(" ");
//        if(d < 5){
//            System.out.printf("%.1f은/는 5보다 작습니다.", d);
//        }
//        else{
//            System.out.printf("%.1f은/는 5보다 큽니다.", d);
//        }
        // 실습3
//        if((a<5)&&(b<5)&&(c<5)){
//            System.out.println("5보다 작은 수는 " + a + " " + b + " " + c + "입니다.");
//        }
//        else if((a<5)&&(b>5)&&(c<5)){
//            System.out.println("5보다 작은 수는 " + a + " " + c + "입니다.");
//        }
//        else if((a<5)&&(b<5)&&(c>5)){
//            System.out.println("5보다 작은 수는 " + a + " "  + b + "입니다.");
//        }
//        else if((a<5)&&(b>5)&&(c>5)){
//            System.out.println("5보다 작은 수는 " + a + "입니다.");
//        }
//        else if((a>5)&&(b<5)&&(c<5)){
//            System.out.println("5보다 작은 수는 " + b + " " + c + "입니다.");
//        }
//        else if((a>5)&&(b<5)&&(c>5)){
//            System.out.println("5보다 작은 수는 " + b + "입니다.");
//        }
//        else if((a>5)&&(b>5)&&(c<5)){
//            System.out.println("5보다 작은 수는 " + c + "입니다.");
//        }
//        else{
//            System.out.println("5보다 작은 수는 없습니다.");
//        }

        // 실습2-연장
//        else if((a<5)&&(b>5)&&(c>5)){
//            System.out.println("5보다 작은 수는 " + a + "입니다.");
//        }
//        else if((a<5)&&(b>5)&&(c<5)){
//            System.out.println("5보다 작은 수는 " + a + c + "입니다.");
//        }
//        else if((a>5)&&(b<5)&&(c>5)){
//            System.out.println("5보다 작은 수는 " + b + c + "입니다.");
//        }

        // 실습 4
//        A(a);
//        A(b);
//        A(c);

        // 실습 5
        int returnNum = KeyInput(sc);
        System.out.println("입력받은 숫자: " + returnNum);


    }

    // 실습4 메소드
//    public static void A(int num){
//        if(num<5){
//            System.out.printf("%d는 5보다 작습니다.", num);
//        }
//        else{
//            System.out.printf("%d는 5보다 큽니다.", num);
//        }
//        System.out.println(" ");
//    }
    public static int KeyInput(Scanner sc){
        int iInput;
        System.out.print("정수 하나를 입력하세요: ");
        iInput = sc.nextInt();
        return iInput;
    }
}
