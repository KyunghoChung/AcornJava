package day10.professor;
import java.util.Scanner;

public class ReviewMain02 {

    public static void main(String[] args) {
        // 입력된 네 개의 수가 있습니다.
        Scanner sc = new Scanner(System.in);
        // 두 개는 실수, 두 개는 정수
        int iA, iB;
        double dC, dD;
        System.out.print("정수를 입력:>>> ");
        iA = sc.nextInt();
        System.out.print("정수를 입력:>>> ");
        iB = sc.nextInt();
        System.out.print("실수를 입력:>>> ");
        dC = sc.nextDouble();
        System.out.print("실수를 입력:>>> ");
        dD = sc.nextDouble();

        // 세 수를 검사해서 5보다 작은 수를 출력
        if(iA < 5) { System.out.println(iA); }

        if(iB < 5) {}

        if(dC < 5) {}

        if(dD < 5) {}



    }

}