package com.acorn.inheritance;

public class TVChild extends AudioTVParent {
    private int size;

    public TVChild(){
        // super
        this(true, 10, 20);
        System.out.println("I'm a TV Child");
    }
    public TVChild(boolean power, int volume, int size){
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
