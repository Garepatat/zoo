package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

public class Seal extends Animal implements Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Seal(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("arf arf");
    }

    @Override 
    public void eatMeat() {
        System.out.println("nomnomnom fishy");
    }

    @Override
    public void performTrick() {
        if (random.nextInt(2) == 0) {
            System.out.println("balances a ball on nose");
        } else {
            System.out.println("claps flippers");
        }
    }
}
