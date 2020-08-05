package com.media.assignment1;

public class Rooster extends Bird {

    private final ChickenSound sound;
    public Rooster() {
        sound = new ChickenSound(true);
    }
    public String getSound() {
        return sound.getSound();
    }


    @Override
    public void sing() {
        System.out.println(sound);
    }
}

