package com.acorn.inheritance;

import com.acorn.inheritance.AudioTVParent;

public class Audio extends AudioTVParent{
    public Audio(){ }
    public Audio(boolean power, int volume){
        super(power,volume);
    }
    public void tune(){
        String sOnOff = getPoewr() ? "Ha Ha Ha ..." : "Turn it On";
        System.out.println(sOnOff);
    }
}
