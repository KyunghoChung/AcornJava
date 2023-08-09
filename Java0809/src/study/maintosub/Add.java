package study.maintosub;

public class Add {
    // 필드(속성) 영역

    // 생성자 영역: public 클래스명(): 기본 생성자/인자가 있는 생성자
    public Add(){ }
    // Getter/Setter 메서드 영역

    // 일반 메서드 영역: 정적/동적
    // 정적 메서드 영역
//    public static int addOperation(int iAddFirstNum, int iAddSecondNum) {
//        int iAddResultValue = 0;
//        // + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//        iAddResultValue = iAddFirstNum + iAddSecondNum;
//        return iAddResultValue;
//    }

    // 동적 메서드 영역
    public int addOperation(int iAddFirstNum, int iAddSecondNum){
        int iAddResultValue;
        iAddResultValue = iAddFirstNum + iAddSecondNum;
        return iAddResultValue;
    }

    // 메서드 오버로딩 영역
    public double addOperation(double dAddFirstNum, double dAddSecondNum){
        double dAddResultValue;
        dAddResultValue = dAddFirstNum + dAddSecondNum;
        return dAddResultValue;
    }

//    public double addOperation(int iAddFirstNum, double iAddSecondNum){
//        double iAddResultValue;
//        iAddResultValue = iAddFirstNum + iAddSecondNum;
//        return iAddResultValue;
//    }
//
//    public double addOperation(double iAddFirstNum, int iAddSecondNum){
//        double iAddResultValue;
//        iAddResultValue = iAddFirstNum + iAddSecondNum;
//        return iAddResultValue;
//    }

}


