package ru.nsu.ci.animals;

public abstract class Cat extends Pet {

    protected Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Meow!");
    }

}
