package com.media.assignment1;

import com.media.assignment.Animal;
import com.media.assignment1.interfaces.Swim;

public class Dolphin extends Animal implements Swim {
    @Override
    public void swim() {
        System.out.println("I can swim.");
    }
}

