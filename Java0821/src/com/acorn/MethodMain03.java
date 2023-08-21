package com.acorn;

public class MethodMain03 {
    public static void main(String[] args) {
        countDown(10);
    }

    public static void countDown(int count){
        if(count <= 0){
            System.out.println("count는 0보다 커야합니다.");
            return;
        }

        for(int i = count; i > 0 ; i--){
            System.out.print(i + " ");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){    // 예외처리
                System.out.println("sleep 실행 중 에러");
                e.printStackTrace();
            }
        }
        System.out.println();

    }
}
