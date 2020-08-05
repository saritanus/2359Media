package com.media.assignment1;

import com.media.assignment1.interfaces.ParrotHome;

public class ParrotWithRooster implements ParrotHome {
    @Override
    public String getSound() {
        return new Rooster().getSound();
    }
}
