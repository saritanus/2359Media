package com.media.assignment1;

import com.media.assignment1.interfaces.ParrotHome;

public class ParrotWithDog implements ParrotHome {
    @Override
    public String getSound() {
        return new Dog().getSound();
    }
}
