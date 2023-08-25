package com.acorn.main;

import com.acorn._class.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("현대", 20.5f);

        System.out.println(car.getsManufacturer() + "자동차");
        System.out.println("현재 연료량: "+ car.getfFuel() + "L");

        // 시동 켜기
        car.switchOn();
        while(true){
            // 가속 페달 밟기
            car.accerlate();
            // 차량 정보 출력
            car.displayCarInfo();
        }
//        // 가속 페달 밟기
//        car.accerlate();
//
//        // 차량 속도 및 연료량 출력
//        System.out.println("속도: " + car.getfSpeed() + " km/h");
//        System.out.println("연료량: " + car.getfFuel() + " L");
//
//        // 가속 페달 더 밟기
//        car.accerlate();
//
//        // 차량 속도 및 연료량 출력
//        System.out.println("속도: " + car.getfSpeed() + " km/h");
//        System.out.println("연료량: " + car.getfFuel() + " L");
//
//        // 차량 브레이크 밟기
//        car._break();
//        System.out.println("속도: " + car.getfSpeed() + " km/h");
        // 시동 끄기
        car.switchOff();


    }
}
