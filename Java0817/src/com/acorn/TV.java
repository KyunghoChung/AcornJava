package com.acorn;

public class TV {
    private boolean power;
    private int volume;
    private int size;

    public TV() {
    }

    public  TV(boolean power, int volume, int size){
        this.power = power;
        this.volume = volume;
        this.size = size;
    }

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        // TODO implement here
        this.size = size;
    }

    public void watch() {
        String sOnOff = power ? "Have fun" : "Switch on";
        System.out.println(sOnOff);
    }

}