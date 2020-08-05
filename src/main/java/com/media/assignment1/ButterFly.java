package com.media.assignment1;

import com.media.assignment.Animal;
import com.media.assignment1.interfaces.Fly;

public class ButterFly extends Animal implements Fly {
    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}