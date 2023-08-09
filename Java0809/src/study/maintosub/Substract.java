package study.maintosub;

public class Substract {

    public Substract() { }
// 정적 메서드
//    public static int subOperation(int iAddFirstNum, int iAddSecondNum) {
//        int iAddResultValue = 0;
//        // + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//        iAddResultValue = iAddFirstNum - iAddSecondNum;
//        return iAddResultValue;
//    }

    // 동적 메서드
    public int subOperation(int iAddFirstNum, int iAddSecondNum){
        int iAddResultValue;
        iAddResultValue = iAddFirstNum - iAddSecondNum;
        return iAddResultValue;
    }
}
