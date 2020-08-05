package com.media.assignment1;

public class Rooster extends Bird {
    private final ChickenSound sound;

    public Rooster() {
        sound = new ChickenSound(true);
    }
    @Override
    public void sing() {
        System.out.println(sound);
    }
}

