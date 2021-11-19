package ru.nsu.ci.animals;

public class SphynxCat extends Cat {

    private boolean warmed;

    public SphynxCat(String name) {
        super(name);
    }

    @Override
    public boolean isHappy() {
        return warmed;
    }

    public void setWarmed(boolean warmed) {
        this.warmed = warmed;
    }

}
