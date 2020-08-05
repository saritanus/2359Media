package com.media.assignment1;

import com.media.assignment1.interfaces.FishCharacter;

public class SharkCharacter implements FishCharacter {
    @Override
    public String getColor() {
        return "Grey";
    }

    @Override
    public String getSize() {
        return "Big";
    }

    @Override
    public boolean eatOtherFish() {
        return true;
    }

    @Override
    public boolean canMakeJokes() {
        return false;
    }
}

