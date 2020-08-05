package com.media.assignment1;

import com.media.assignment.Animal;
import com.media.assignment1.interfaces.Sound;
import com.media.assignment1.interfaces.Walk;

public class Dog extends Animal implements Walk, Sound {

    private  String sound;
    public  Dog(){
        sound = "Woof,woof" ;
    }
    public String getSound() {
        return sound;
    }
    @Override
    public void makeSound(String input) {
        System.out.println(input);
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}

