package com.acorn;

public class testBubbleSort {
    public static void main(String[] args) {
        int [] scores = {60 , 50, 95, 80, 70, 12, 99};
        sort(scores);
        for(int i = 0; i < scores.length ; i++){
            System.out.print(scores[i] + ", ");
        }
    }
    public static void sort(int [] arrays){
        for(int i = 0; i < arrays.length - 1 ; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {    // swap
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }
}
