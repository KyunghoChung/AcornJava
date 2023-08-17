package com.acorn.inheritance;

public class AudioTVParent {
    private boolean power;
    private int volume;

    public AudioTVParent(){}
    public AudioTVParent(boolean power, int volume){
        this.power = power;
        this.volume = volume;
    }

    public boolean getPoewr(){
        return power;
    }
    public void setPower(boolean power){
        this.power = power;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
