package com.acorn;

public class testMaxValue {
    public static void main(String[] args) {
    int [] scores = {60,80,99,12,70};
    int maxValue = max(scores);
    System.out.println("MaxValue = " + maxValue);
    }
    public static int max(int [] arrays){
        for(int i = 0; i < arrays.length - 1 ; i++){
            if(arrays[i] > arrays[i+1]){
                int temp = arrays[i];
                arrays[i] = arrays[i+1];
                arrays[i+1] = temp;
            }
        }
        int maxValue = arrays[arrays.length - 1];
        return maxValue;
    }
}
