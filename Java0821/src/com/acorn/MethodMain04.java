package com.acorn;

// 메소드 오버로딩
public class MethodMain04 {
    public static void main(String[] args) {
        overLoadingTest();
        overLoadingTest("korean");
        overLoadingTest(2023);
        overLoadingTest("korean", 2023);

    }

    public static void overLoadingTest(){
        System.out.println("안녕하세요");
    }
    public static void overLoadingTest(String string){
        System.out.println("안녕하세요 저는 " + string + "입니다.");
    }
    public static void overLoadingTest(int i){
        System.out.println("지금은 " + i + "년 입니다.");

    }
    public static void overLoadingTest(String string, int i){
        System.out.println("안녕하세요 저는 " + i + "년에 스물 두 살인 " + string + "입니다.");
    }
}
