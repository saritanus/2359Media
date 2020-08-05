package com.media.assignment1;

import com.media.assignment.Animal;
import com.media.assignment1.interfaces.Sound;
import com.media.assignment1.interfaces.Walk;

public class Cat extends Animal implements Walk, Sound {
    private  String sound;
    public  Cat(){
        sound = "Meow, meow" ;
    }
    public String getSound() {
        return sound;
    }

    @Override
    public void makeSound(String input) {
        System.out.println("Meow, meow");
    }

    @Override
    public void walk() {
        System.out.println("I am walking.");
    }
}
