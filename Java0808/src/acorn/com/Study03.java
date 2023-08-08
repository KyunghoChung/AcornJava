package acorn.com;

import java.util.*;
public class Study03 {
    public static void main(String[] args) {
        /* 문자열을 입력받아:
        * String sInputMsg;
        * sInputMsg.length()
        * (문자) 배열을 선언:
        * 문자 하나하나를 저장:
        *   charAt(인덱스)
        * 검색할 수 있는 문자가: 미리 검색문자
        * 변수 선언과 초기화 or 키보드 입력
        * 문자열에 몇 개 들어가 있는지 개수 출력*/

        Scanner sc = new Scanner(System.in);
        String sInputMsg;
        char[] cArray;
        int iArraySize;
        char cChar = 'a';
        int iCount = 0;

        System.out.print("문자열을 입력하세요: ");
        sInputMsg = sc.nextLine();

        iArraySize = sInputMsg.length();
        cArray = new char[iArraySize];

        // 문자열에서 하나하나의 문자를 문자배열에 저장
        for(int i = 0; i < iArraySize; i++){
            cArray[i] = sInputMsg.charAt(i);
        }
        for(int i = 0; i < iArraySize; i++){
            System.out.print(cArray[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < iArraySize; i++){
            if(cArray[i] == cChar){
                iCount++;
            }
        }
        System.out.printf("일치하는 문자의 수는 %d개 입니다.", iCount);


    }
}
