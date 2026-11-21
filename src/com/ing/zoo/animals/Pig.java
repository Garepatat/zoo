package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;


public class Pig extends Animal implements Herbivore, Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("oink");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink thx");
    }

    @Override 
    public void performTrick() {
        if (random.nextInt(2) == 0) {
            System.out.println("rolls in the mud");
        } else {
            System.out.println("runs in circles");
        }
    }
}
