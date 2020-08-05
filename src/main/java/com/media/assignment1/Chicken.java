package com.media.assignment1;

/**
 * As per the requirement chicken can not fly. By default we consider chicken as female
 */
public class Chicken extends Bird {

    private final ChickenSound sound;

    public Chicken() {
        this.sound = new ChickenSound(false);
    }

    @Override
    public void sing() {
        System.out.println(sound);
    }
}
