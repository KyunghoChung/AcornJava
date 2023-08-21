package com.acorn;

public class MethodMain05 {
    public static void main(String[] args) {
//        int iTotal = 0;
        int[] iSum = {10, 20, 100, 200, 90, 70};
//        for(int i = 0; i < iSum.length ; i++){
//            iTotal = iTotal + iSum[i];  // iTotal += iSum[i];
//        }
//        System.out.println(iTotal);

        System.out.println(arrayCalc(iSum));
    }

    public static int arrayCalc(int[] iSum) {
        int sum = 0;
        for (int i = 0; i < iSum.length; i++) {
            sum += iSum[i];
        }
        return sum;
    }
}
