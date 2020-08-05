package com.media.assignment1;

import com.media.assignment.Animal;
import com.media.assignment1.interfaces.Jump;

public class Frog extends Animal implements Jump {
    @Override
    public void jump() {
        System.out.println("I am jumping.");
    }
}
