package com.media.assignment1;

import com.media.assignment.Animal;
import com.media.assignment1.interfaces.Walk;

class Bird extends Animal implements Walk {
    //All birds can not fly, so removing fly method from the super class
    void fly() {
        System.out.println("I am flying.");
    }

    public void sing() {
        System.out.println("I am singing.");
    }

    @Override
    public void walk() {
        System.out.println("I am walking.");
    }
}

