package com.acorn;

import java.util.Scanner;
public class Study01 {

    public static void main(String[] args) {
        Study01 mainInstance = new Study01();
        mainInstance.practice04();
//        System.out.println("1. 입력");
//        System.out.println("2. 수정");
//        System.out.println("3. 조회");
//        System.out.println("4. 삭제");
//        System.out.println("5. 종료");
//        System.out.print("메뉴 번호를 입력하세요: ");
//        Scanner sc = new Scanner(System.in);
//        int iInputValue = sc.nextInt();
//
//        if(iInputValue == 1){
//            System.out.print("입력 메뉴입니다.");
//        }
//        else if(iInputValue == 2){
//            System.out.print("수정 메뉴입니다.");
//        }
//        else if(iInputValue == 3){
//            System.out.print("조회 메뉴입니다.");
//        }
//        else if(iInputValue == 4){
//            System.out.print("삭제 메뉴입니다.");
//        }
//        else if(iInputValue == 5){
//            System.out.print("종료 메뉴입니다.");
//        }
//        else {
//            System.out.print("실행할 수 없는 메뉴입니다.");
//        }

    }
     public void practice01(){
        System.out.print("숫자를 입력하세요: ");
         Scanner sc = new Scanner(System.in);
         int inputValue = sc.nextInt();
         if(inputValue > 0){
             System.out.println("양수입니다.");
         } else if (inputValue == 0) {
             System.out.println("0 입니다.");
         }
         else {
             System.out.println("음수입니다.");
         }
     }
//    public void practice04(){
//        Scanner sc = new Scanner(System.in);
//        int inputValue = sc.nextInt();
//
//        if(inputValue <= 0){
//            sout("1이상의 숫자를 입력해주세요.");
//        }
//        else{
//            for(int i = inputValue ; i >= 1 ; i--){
//                sout(i);
//            }
//        }
//    }
    public void practice04(){
        System.out.print("1 ~ 12 사이 정수 입력: ");
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        if(inputValue <= 0 || inputValue >12 ){
            System.out.println("다시 입력하세요.");
        }
        else if (inputValue >= 2 && inputValue <= 4) {
            System.out.println("봄입니다.");
        }
        else if (inputValue >= 5 && inputValue <= 8) {
            System.out.println("여름입니다.");
        }
        else if (inputValue >= 9 && inputValue <= 11) {
            System.out.println("가을입니다.");
        }
        else{
            System.out.print("겨울입니다.");
        }

    }
    // 아래는 위 코드의 switch case문
//    public void practice04() {
//        System.out.print("Input an integer between 1 and 12: ");
//        Scanner sc = new Scanner(System.in);
//        int inputValue = sc.nextInt();
//
//        if (inputValue <= 0 || inputValue > 12) {
//            System.out.println("Please enter again");
//            return;
//        }
//
//        String season;
//
//        switch (inputValue) {
//            case 2:
//            case 3:
//            case 4:
//                season = "Spring";
//                break;
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//                season = "Summer";
//                break;
//            case 9:
//            case 10:
//            case 11:
//                season = "Autumn";
//                break;
//            default:
//                season = "Winter";
//                break;
//        }
//
//        System.out.println("It's " + season);
//    }
    public void study03(){

    }
}
