package com.acorn.inheritance;

import javax.xml.transform.Source;

public class AudioChild extends AudioTVParent{
    public AudioChild(){
        System.out.println("I'm an Audio Child");
    }
    public AudioChild(boolean power, int volume){
        super(power,volume);
    }
    public void tune(){
        String sOnOff = getPoewr() ? "Ha Ha Ha ..." : "Turn it On";
        System.out.println(sOnOff);
    }
}
