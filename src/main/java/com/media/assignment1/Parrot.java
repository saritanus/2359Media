package com.media.assignment1;

import com.media.assignment1.interfaces.Fly;
import com.media.assignment1.interfaces.ParrotHome;

public class Parrot extends Bird implements Fly {
    ParrotHome home;

    public Parrot(){}

    public Parrot(ParrotHome home) {
        this.home = home;
    }

    @Override
    public void sing() {
        System.out.println(home.getSound());
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}
