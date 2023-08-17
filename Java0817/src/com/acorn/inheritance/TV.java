package com.acorn.inheritance;

import com.acorn.inheritance.AudioTVParent;

public class TV extends AudioTVParent {
    private int size;

    public TV(){ }
    public TV(boolean power, int volume, int size){
        super(power, volume);
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void watch(){
        String sOnOff = getPoewr() ? "Have fun" : "Turn it on";
        System.out.println(sOnOff);
    }
}
