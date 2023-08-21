package com.acorn;

public class MethodMain02 {
    public static void main(String[] args) {
        System.out.println("메소드");

        double dFirst = 11.1; double dSecond = 12.1;
        // 동적 메소드 사용(CalcDblJar)
//        CalcDblJar calcDblJar = new CalcDblJar();
////        dRet = dFirst + dSecond;        // ADD
//        double dRet = calcDblJar.add(dFirst, dSecond);
//        System.out.println(dRet);
//        dRet = calcDblJar.subtract(dFirst, dSecond);    // SUBTRACT
//        System.out.println(dRet);
//        dRet = calcDblJar.multiply(dFirst, dSecond);        // MULTIPLY
//        System.out.println(dRet);
//        dRet = calcDblJar.divide(dFirst, dSecond);        // DIVIDE
//        System.out.println(dRet);

        // 정적 메소드 사용(CalcDblJar02)
//        dRet = dFirst + dSecond;        // ADD
        double dRet = CalcDblJar02.add(dFirst, dSecond);
        System.out.println(dRet);
        dRet = CalcDblJar02.subtract(dFirst, dSecond);    // SUBTRACT
        System.out.println(dRet);
        dRet = CalcDblJar02.multiply(dFirst, dSecond);        // MULTIPLY
        System.out.println(dRet);
        dRet = CalcDblJar02.divide(dFirst, dSecond);        // DIVIDE
        System.out.println(dRet);


    }
//    public static double add(double dFirst, double dSecond){
//        double iRet = dFirst + dSecond;
//        return iRet;
//    }
//    public static double subtract(double dFirst, double dSecond){
//        double iRet = dFirst - dSecond;
//        return iRet;
//    }
//    public static double multiply(double dFirst, double dSecond){
//        double iRet = dFirst * dSecond;
//        return iRet;
//    }
//    public static double divide(double dFirst, double dSecond){
//        double iRet = 0.0;
//        if(dFirst ==0.0){
//            iRet = 0.0;
//        }
//        if(dSecond == 0.0){
//            iRet = -1.0;
//        }
//        else{
//            iRet = dFirst / dSecond;
//        }
//        return iRet;
//    }
}
