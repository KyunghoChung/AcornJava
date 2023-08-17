package com.acorn;

public class UseMain {
    public static void main(String[] args) {
        TV tv = new TV(false, 12, 40);
        Audio audio = new Audio(true, 15);

        tv.setPower(true);
        tv.watch();

        audio.setVolume(10);
        audio.tune();
    }



}
