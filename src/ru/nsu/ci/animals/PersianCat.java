package ru.nsu.ci.animals;

public class PersianCat extends Cat {

    private boolean furminated;
    private boolean fed;
    private boolean stroked;

    public PersianCat(String name) {
        super(name);
    }

    @Override
    public boolean isHappy() {
        return furminated && fed && stroked;
    }

    public void setFurminated(boolean furminated) {
        this.furminated = furminated;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    public void setStroked(boolean stroked) {
        this.stroked = stroked;
    }
}
