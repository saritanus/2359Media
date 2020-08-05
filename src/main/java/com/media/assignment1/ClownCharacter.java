package com.media.assignment1;

import com.media.assignment1.interfaces.FishCharacter;

public class ClownCharacter implements FishCharacter {
    @Override
    public String getColor() {
        return "Orange";
    }

    @Override
    public String getSize() {
        return "Small";
    }

    @Override
    public boolean eatOtherFish() {
        return false;
    }

    @Override
    public boolean canMakeJokes() {
        return true;
    }
}

