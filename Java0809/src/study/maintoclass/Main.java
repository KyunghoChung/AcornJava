package study.maintoclass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        // 필드 영역
//        // 개체 부분
//        Scanner sc = new Scanner(System.in);
//
//        // 공통 부분
//        String sInputMsg1 = "첫 번째 수를 입력하세요: ";
//        String sInputMsg2 = "두 번째 수를 입력하세요: ";
//        String sResultMsg = "결과 값은 ";
//        // 결과 저장 부분
//
//        // 더하기 부분
//        int iAddResultValue = 0;
//        int iAddFirstNum;
//        int iAddSecondNum;
//        // 빼기 부분
//        int iSubResultValue = 0;
//        int iSubFirstNum;
//        int iSubSecondNum;
//        // 곱하기 부분
//        int iMulResultValue = 0;
//        int iMulFirstNum;
//        int iMulSecondNum;
//        // 나누기 부분
//        int iDivResultValue = 0;
//        int iDivFirstNum;
//        int iDivSecondNum;
//
//        // 오퍼레이션 영역
//        // 더하기 부분
//        System.out.print(sInputMsg1);
//        iAddFirstNum = sc.nextInt();
//        System.out.print(sInputMsg2);
//        iAddSecondNum = sc.nextInt();
//        iAddResultValue = iAddFirstNum + iAddSecondNum;
//        System.out.println(sResultMsg + iAddResultValue);
//        // 빼기 부분
//        System.out.print(sInputMsg1);
//        iSubFirstNum = sc.nextInt();
//        System.out.print(sInputMsg2);
//        iSubSecondNum = sc.nextInt();
//        iSubResultValue = iSubFirstNum - iSubSecondNum;
//        System.out.println(sResultMsg + iSubResultValue);
//        // 곱하기 부분
//        System.out.print(sInputMsg1);
//        iMulFirstNum = sc.nextInt();
//        System.out.print(sInputMsg2);
//        iMulSecondNum = sc.nextInt();
//        iMulResultValue = iMulFirstNum * iMulSecondNum;
//        System.out.println(sResultMsg + iMulResultValue);
//        // 나누기 부분
//        System.out.print(sInputMsg1);
//        iDivFirstNum =  sc.nextInt();
//        System.out.print(sInputMsg2);
//        iDivSecondNum = sc.nextInt();
//        if(iDivSecondNum == 0){
//            System.out.println("0으로는 다른 수를 나눌 수 없습니다.");
//        }
//        else if(iDivFirstNum == 0){
//            System.out.println("0을 나누면 값은 0이 됩니다.");
//        }
//        else{
//            iDivResultValue = iDivFirstNum / iDivSecondNum;
//            System.out.println(sResultMsg + iDivResultValue);
//        }
//
//
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Basic Calculator!");
    System.out.print("첫 번째 숫자 입력: ");
    double num1 = scanner.nextDouble();
    System.out.print("두 번째 숫자 입력: ");
    double num2 = scanner.nextDouble();

    double sum = add(num1, num2);
    double difference = subtract(num1, num2);
    double product = multiply(num1, num2);
    double quotient = divide(num1, num2);

    System.out.println("덧셈: " + sum);
    System.out.println("뺄셈: " + difference);
    System.out.println("곱셈: " + product);
    System.out.println("나눗셈: " + quotient);

    scanner.close();
}

    // Addition Method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction Method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication Method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division Method
    public static double divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            return Double.parseDouble(String.format("%.1f", result));
        }
        else if(a == 0){
            System.out.println("0을 나누면 항상 0입니다.");
            return 0;
        }
        else {
            System.out.println("0으로 나눌 수 없습니다.");
            return Double.NaN; // Return NaN (Not-a-Number) for division by zero
        }
    }

}
