package acorn.com;

import java.util.*;
public class Study01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iArraySize = 0;
        int [] iArray;
        // 1. 사용자에게 입력 받은
        System.out.print("생성할 배열의 크기 입력: ");
        iArraySize = sc.nextInt();
        // 2. 양의 정수만큼 배열 크기를 할당
        iArray = new int[iArraySize];
        // 3. 1부터 입력 받은 값까지 배열에 저장
        for(int  i = 0; i < iArraySize; i ++){
            iArray[i] = i +1;
        }
        // 4. 출력
        for(int  i = 0; i < iArraySize; i ++){
            System.out.print(iArray[i] + " ");
        }
        sc.close();
    }
}
