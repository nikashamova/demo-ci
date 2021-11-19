package ru.nsu.ci.animals;

public class Pig extends Pet {

    private boolean fed;

    public Pig(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Oink!");
    }

    @Override
    public boolean isHappy() {
        return fed;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    // продолжение примера можно посмотреть в GitHub

}
