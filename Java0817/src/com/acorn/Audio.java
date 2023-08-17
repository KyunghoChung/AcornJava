package com.acorn;

public class Audio {

    private boolean power;
    private int volume;

    public Audio() {
    }

    public Audio(boolean power, int volume){
        this.power = power;
        this.volume = volume;
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

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void tune() {
        String sOnOff = power ?  "ha ha ha..." : "turn it on";
        System.out.println(sOnOff);
    }
}