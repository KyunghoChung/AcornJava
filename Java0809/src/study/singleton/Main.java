package study.singleton;

public class Main {
    public static void main(String[] args) {
//        int a;
//        int b;
//        int c;
        // 객체는 힙에 생성돈다.(메모리): 주소 값으로 표현(레퍼런스)
//        SingleTonTest singleTonTest1 = new SingleTonTest();
//        SingleTonTest singleTonTest2 = new SingleTonTest();
//        SingleTonTest singleTonTest3 = new SingleTonTest();
//
//        System.out.println(singleTonTest1);
//        System.out.println(singleTonTest2);
//        System.out.println(singleTonTest3);

        SingleTonTest st1 =  SingleTonTest.getInstance("CKH");
        System.out.println(st1);
        SingleTonTest st2 = SingleTonTest.getInstance("YHS");
        System.out.println(st2);
        // 따로 줘도 이미 저장된 레퍼런스를 가져온다.
        // 하나 만들어서 돌려서 써라는 의미로 싱글톤을 설명해주셨음
        // 결국 알려주고자 했던 것은 static의 사용 원리
    }
}
