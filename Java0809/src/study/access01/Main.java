package study.access01;

// 클래스 멤버 접근 수식(Access Modifier)
// 1. private 2. package 3. protected 4. public
// 가. 기능: 클래스 멤버에 대한 접근 권한 설정
// 나. 의미:
// 1) private: 선언된 클래스 안에서만 직접 접근 가능
// 2) (package): 같은 패키지(폴더)의 클래스들에서 직접 접근 가능
// 3) protected: 같은 패키지에 있거나, 상속하는 클래스에서 직접 접근 가능
// 4) public: 어디에서나 직접 접근 가능
// 4 -> 1 순서로 접근을 막는 정도가 강함

import study.access.AccessTest;

public class Main {
    public static void main(String[] args) {
        AccessTest accessTest = new AccessTest();

        // Directly accessing fields from the same package
//        accessTest.b = 20;
//        accessTest.c = 30;
//        accessTest.d = 40;
//
//        System.out.println("b: " + accessTest.b);
//        System.out.println("c: " + accessTest.c);
//        System.out.println("d: " + accessTest.d);

        // Using getters/setters
        accessTest.setA(15);
        int a = accessTest.getA();
        System.out.println("a: " + a);
    }
}