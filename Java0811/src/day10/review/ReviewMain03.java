package day10.review;

import java.util.Scanner;

public class ReviewMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 크기를 입력하세요: ");
        int arrayLength = sc.nextInt();
        int[] array01 = new int[arrayLength];
        int[] array02 = new int[arrayLength];
        System.out.print("배열 값 입력: ");
        int arrayValue = sc.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            array01[i] = arrayValue;
            if (i % 2 == 0) {
                array02[i] = arrayValue;
            }
        }

        System.out.println("Array02:");
        for (int value : array02) {
            System.out.print(value + " ");
        }
        System.out.println();

        ArrayPractice(array01, array02);

        System.out.println("Array01은 Array02를 복사하고 같은 값을 출력합니다.");
        for (int value : array01) {
            System.out.print(value + " ");
        }

        sc.close();
    }

    public static void ArrayPractice(int[] arr1, int[] arr2) {
        int length = Math.min(arr1.length, arr2.length);

        // array2 -> array1: 같은 위치 (짝수 인덱스)
        for (int i = 0; i < length; i++) {
            arr1[i] = arr2[i];
        }
    }

    public static void IndexExchange(int[] arr1){
        for(int i = 0 ; i < arr1.length; i++){

        }
    }


}
