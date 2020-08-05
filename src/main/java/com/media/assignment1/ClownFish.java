package com.media.assignment1;

import com.media.assignment1.interfaces.FishCharacter;

public class ClownFish extends Fish {
    FishCharacter character;

    public ClownFish() {
        this.character = new ClownCharacter();
    }

    public void getCharacters() {
        System.out.println(character.getSize());
        System.out.println(character.canMakeJokes());
        System.out.println(character.eatOtherFish());
    }
}
