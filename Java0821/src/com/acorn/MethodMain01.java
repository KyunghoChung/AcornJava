package com.acorn;


// 메서드: 프로그램의 (반복되는 부분) 기능을 코드 블럭으로 작성
// 메서드는 클래스 안에 선언/정의함
// 메서드는 다른 메서드 안에서 선언/정의 불가능 <-- 호출만 가능
// 리턴타입: void, 파라미터(Argument)
// 관련 메모리 영역: 스택
// 메소드는 가급적 외부에 오픈, 필드는 가급적 오픈 X

public class MethodMain01 {
    public static void main(String[] args) {

        System.out.println("1. ");
        newLine();  // 메소드 호출
        System.out.println("2. ");
        newLine(3);
    }

    public static void newLine(int n){
        for(int i = 0; i < n; i++){
            System.out.println();
        }
    }

    public static void newLine(){
        System.out.println();
    }
}

