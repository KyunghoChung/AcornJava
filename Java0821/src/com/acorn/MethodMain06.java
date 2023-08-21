package com.acorn;

//import java.util.*;
public class MethodMain06 {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
    int[] iFindMinValArr = {1, 6, 8, 3, 22, 54, 121, 32};
    int[] iFindMaxValArr = {1, 6, 8, 3, 22, 54, 121, 32};

    int iMaxVal = 0;
    int iMinVal = 0;

    iMinVal = getFindMinVal(iFindMinValArr);
    iMaxVal = getFindMaxVal(iFindMaxValArr);

    System.out.println("최솟값: " + iMinVal);
    System.out.println("최댓값: " + iMaxVal);
    }

    public static int getFindMinVal(int[] iFindMinValArr) {
        int minVal = Integer.MAX_VALUE; // 가능한 최댓값으로 초기화

        for (int i = 0; i < iFindMinValArr.length; i++) {
            if (iFindMinValArr[i] < minVal) {
                minVal = iFindMinValArr[i];
            }
        }

        return minVal;
    }

    public static int getFindMaxVal(int[] iFindMaxValArr) {
        int maxVal = Integer.MIN_VALUE; // 가능한 최솟값으로 초기화

        for (int i = 0; i < iFindMaxValArr.length; i++) {
            if (iFindMaxValArr[i] > maxVal) {
                maxVal = iFindMaxValArr[i];
            }
        }

        return maxVal;
    }
}
