package com.ing.zoo.animals;

public abstract class Animal {
    // private + final = encapsulatie: naam wordt 1x gezet via de constructor
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Elk dier moet zijn eigen sayhello() invullen
    public abstract void sayHello();
}
