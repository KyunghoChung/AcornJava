package day10.review;

import java.util.Scanner;

public class ReviewMain02 {
    public static void main(String[] args) {
        // 키보드에서 생성하고자 하는
        // 배열 사이즈를 받아서 배열 생성 - integer 타입
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 사이즈를 홀수로 입력하세요: ");
        int arrayLength = sc.nextInt();
        arrayPractice(sc, arrayLength);

        // 배열의 가운데 위치에 키보드 입력 받은 값을 저장(배열 size >= 3)
        // 입력한 값을 뽑아서 출력
        sc.close();
    }

    public static void arrayPractice(Scanner sc, int arrayLength){
        if (arrayLength%2 == 0){
            System.out.print("홀수를 입력해주세요.");
        }
        else if(arrayLength < 3){
            System.out.print("3 이상의 숫자를 입력해주세요.");
        }
        else {
            int[] array = new int [arrayLength];

            // Save the value received from the keyboard at the center of the array (array size >= 3)
            System.out.print("배열 중앙에 넣을 값을 입력하세요: ");
            int midInput = sc.nextInt();

            int centerIndex = arrayLength / 2;
            array[centerIndex] = midInput;

            // Extract the input value and output it
            System.out.println(array[centerIndex-1] + ":" + array[centerIndex] + ":" + array[centerIndex+1]);
        }

    }
}
