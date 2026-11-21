package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

public class Elephant extends Animal implements Herbivore, TrickPerformer {
    private final Random random = new Random();

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("pawoo");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch trumpeting");
    }

    @Override
    public void performTrick() {
        if (random.nextInt(2) == 0) {
            System.out.println("sprays water with trunk");
        } else {
            System.out.println("balances on a ball");
        }
    }
}
