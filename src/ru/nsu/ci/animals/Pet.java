package ru.nsu.ci.animals;

public abstract class Pet implements Animal {

    private final String name;

    protected Pet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
