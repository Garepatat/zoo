package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
            new Lion("henk"),
            new Hippo("elsa"),
            new Pig("dora"),
            new Tiger("wally"),
            new Zebra("marty"),
            new Elephant("dumbo"),
            new Seal("sammy")
        );

        Scanner scanner = new Scanner(System.in);

        // Loop zodat je meerdere commando's achter elkaar kunt testen (tpe 'exit' om te stoppen)
        while (true) {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equals("hello")) {
                for (Animal animal : animals) {
                    animal.sayHello();
                }
            } else if (input.startsWith("hello ")) {
                String targetName = input.substring(6).trim();
                boolean found = false;

                for (Animal animal : animals) {
                    if (animal.getName().equalsIgnoreCase(targetName)) {
                        animal.sayHello();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No animal found with name: " + targetName);
                }
            } else if (input.equals("give leaves")) {
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
            } else if (input.equals("give meat")) {
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }
            } else if (input.equals("perform trick")) {
                for (Animal animal : animals) {
                    if (animal instanceof TrickPerformer) {
                        ((TrickPerformer) animal).performTrick();
                    }
                }
            } else {
                System.out.println("Unknown command: " + input);
            }
        }

        scanner.close();
    }
}