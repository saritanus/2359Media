package com.media.assignment1;

import com.media.assignment.Animal;

class Bird extends Animal {
    //All birds can not fly, so removing fly method from the super class
    void fly() {
        System.out.println("I am flying.");
    }

    public void sing() {
        System.out.println("I am singing.");
    }
}

