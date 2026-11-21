package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("rraaarww");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    @Override 
    public void performTrick() {
        if (random.nextInt(2) == 0) {
            System.out.println("jumps in tree");
        } else {
            System.out.println("scratches ears");
        }
    }
}
