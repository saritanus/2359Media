package com.media.assignment1;

/**
 * Chicken makes different sound based on their type: female and male
 */
public class ChickenSound {
    private String sound;

    public ChickenSound(boolean isMale) {
        if (isMale) {
            this.sound = "Cock-a-doodle-doo";
        } else {
            this.sound = "Cluck,cluck";
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
