package com.media.assignment1;

import com.media.assignment1.interfaces.Fly;
import com.media.assignment1.interfaces.Swim;

/**
 * Assumption: Duck can fly
 */
public class Duck extends Bird implements Swim, Fly {

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    @Override
    public void swim() {
        System.out.println("I can swim.");
    }

    @Override
    public void fly() {

    }
}
