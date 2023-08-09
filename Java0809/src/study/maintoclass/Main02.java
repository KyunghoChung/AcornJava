package study.maintoclass;

import java.util.Scanner;

import study.maintosub.*;

public class Main02 {

    public static void main(String[] args) {
        Add add = new Add();
        Substract sub = new Substract();
        Multiply mul = new Multiply();
        Divide div = new Divide();
        // 필드 영역
        Scanner sc = new Scanner(System.in);
        String sInputMsg01 = "첫번째수:>>> "; String sInputMsg02 = "두번째수:>>> ";

        // 더하기 부분
        int iAddFirstNum; int iAddSecondNum; int iAddResultValue;
        // 오퍼레이션 영역
        // 더하기 부분
        // 연산 대상 값 할당: 직접 or 키보드입력
        System.out.print(sInputMsg01); iAddFirstNum = sc.nextInt();
        System.out.print(sInputMsg02); iAddSecondNum = sc.nextInt();
//			// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//			iAddResultValue = iAddFirstNum + iAddSecondNum;
//			System.out.println(sResultMsg + iAddResultValue);
        // 제약 조건: 값의 범위
        iAddResultValue = add.addOperation(iAddFirstNum, iAddSecondNum);
        System.out.println(iAddResultValue);
        iAddResultValue = sub.subOperation(iAddFirstNum, iAddSecondNum);
        System.out.println(iAddResultValue);
        iAddResultValue = mul.mulOperation(iAddFirstNum, iAddSecondNum);
        System.out.println(iAddResultValue);
        iAddResultValue = div.divOperation(iAddFirstNum, iAddSecondNum);
        System.out.println(iAddResultValue);

        sc.close();
    }

}