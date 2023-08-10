package study.class_.inheritance.main;

import study.class_.inheritance.Test01;
import study.class_.inheritance.Test02;

import java.net.SocketTimeoutException;

public class TestMain {

    public static void main(String[] args) {
        Test01 test1 = new Test01();
        Test02 test2 = new Test02();

        Test01 test1_1 = new Test01(10, 20);
        Test02 test2_1 = new Test02(30, 50);

        int a = test1_1.getA();
        int b = test1_1.getB();
        int c = test2_1.getC();
        int d = test2_1.getD();

        System.out.println("객체 복사 이전 값");
        System.out.println("Test1 클래스의 필드값: " + a + ":" + b);
        System.out.println("Test2 클래스의 필드값: " + c + ":" + d);
        System.out.println(" ");

//        test1 = test2;
        test1_1.setA(test2_1.getC());
        test1_1.setB(test2_1.getD());
        System.out.println(test1_1.getA());
        System.out.println(test1_1.getB());




    }

}