package com.acorn;

import javax.management.loading.PrivateClassLoader;

public class CalcDblJar {
    // 필드 영역


    // 생성자 영역


    // 메소드 영역
    // Getters/Setters 영역

    // 정적 메소드 영역

    // 동적 메소드 영역
    public double add(double dFirst, double dSecond){
        double iRet = dFirst + dSecond;
        return iRet;
    }
    public double subtract(double dFirst, double dSecond){
        double iRet = dFirst - dSecond;
        return iRet;
    }
    public double multiply(double dFirst, double dSecond){
        double iRet = dFirst * dSecond;
        return iRet;
    }
    public double divide(double dFirst, double dSecond){
        double iRet = 0.0;
        if(dFirst ==0.0){
            iRet = 0.0;
        }
        if(dSecond == 0.0){
            iRet = -1.0;
        }
        else{
            iRet = dFirst / dSecond;
        }
        return iRet;
    }
}
