package com.acorn._class;

public class Car {
    // 필드 영역
    private String sManufacturer; // null
    private float fFuel; // 0.0
    private float fSpeed; // 0.0
    private int IRegistrationNum; // 0
    private boolean bRunning; // false 주행여부

    // 생성자 영역
    public Car() {}

    public Car(String sManufacturer, float fFuel) {
        this.sManufacturer = sManufacturer;
        this.fFuel = fFuel;
    }

    // 메소드 영역
    // Getters/Setters 영역
    public String getsManufacturer() { return sManufacturer; }
    public float getfFuel() { return fFuel; }
    public float getfSpeed() { return fSpeed; }
    public int getIRegistrationNum() { return IRegistrationNum; }
    public boolean isbRunning() { return bRunning; }

    // (동적)메소드 영역
    public void switchOn() { bRunning = true; }
    public void switchOff() { bRunning = false; }

    public void accerlate() {
        if (!bRunning) return;

        if (fSpeed >= 300) { fSpeed += 300; } else {
            fSpeed += 20; }

        if (fFuel > 0.f) { fFuel -= 1.0;
            if (fFuel < 0) { fFuel = 0.f; _break(); }
        }
    }
    public void _break() { fSpeed = 0.f; }
    
    public void fillFuel(){
        this.fFuel += 20.5;
    }

    public void displayCarInfo(){
        this.sManufacturer = getsManufacturer();
        this.fFuel = getfFuel();
        this.fSpeed = getfSpeed();
    }
}
