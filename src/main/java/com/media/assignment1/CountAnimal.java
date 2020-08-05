package com.media.assignment1;

import com.media.assignment.Animal;

public class CountAnimal {
    public static void main(String[] args) {
        int countFly=0;
        int countWalk=0;
        int countSing=0;
        int countSwim=0;
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Frog(),
                new Dog(),
                new ButterFly(),
                new Cat()

        };

        for (Animal animal:animals) {
            //All bird can not fly. Here parrot,duck can fly, chicken and rooster can not fly.
            if(animal instanceof Parrot || animal instanceof ButterFly || animal instanceof Duck){
                countFly++;
            }
            //All birds can sing, not considering cat and dog
            if(animal instanceof Bird){
                countSing++;
            }
            //All birds,dog and cat can walk
            if(animal instanceof Dog ||animal instanceof Cat || animal instanceof Bird ){
                countWalk++;
            }
            //All fish can swim, duck
            if(animal instanceof Fish || animal instanceof Duck ){
                countSwim++;
            }

        }
        System.out.println("No of animal can fly: "+ countFly);
        System.out.println("No of animal can sing: "+ countSing);
        System.out.println("No of animal can walk: "+ countWalk);
        System.out.println("No of animal can swim: "+ countSwim);

    }
}
