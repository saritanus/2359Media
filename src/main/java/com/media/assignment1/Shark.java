package com.media.assignment1;

import com.media.assignment1.interfaces.FishCharacter;

public class Shark extends Fish {
    FishCharacter character;

    public Shark() {
        this.character = new SharkCharacter();
    }

    public void getCharacters() {
        System.out.println(character.getSize());
        System.out.println(character.canMakeJokes());
        System.out.println(character.eatOtherFish());
    }
}