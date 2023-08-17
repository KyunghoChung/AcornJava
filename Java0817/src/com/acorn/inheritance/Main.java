package com.acorn.inheritance;

import com.acorn.Audio;
import com.acorn.TV;

public class Main {
    public static void main(String[] args) {
        com.acorn.TV tv = new TV(false, 12, 40);
        com.acorn.Audio audio = new Audio(true, 15);

        tv.setPower(true);
        tv.watch();

        audio.setVolume(10);
        audio.tune();
    }
}
