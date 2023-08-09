package study.maintosub;

public class Multiply {
    public Multiply() { }

//    public static int mulOperation(int iAddFirstNum, int iAddSecondNum) {
//        int iAddResultValue = 0;
//        // + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//        iAddResultValue = iAddFirstNum * iAddSecondNum;
//        return iAddResultValue;
//    }
    // 동적 메서드
    public int mulOperation(int iAddFirstNum, int iAddSecondNum){
        int iAddResultValue;
        iAddResultValue = iAddFirstNum * iAddSecondNum;
        return iAddResultValue;
    }
}
