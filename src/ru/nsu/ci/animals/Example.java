package ru.nsu.ci.animals;

public class Example {

    public static void main(String[] args) {
        Animal persCat = new PersianCat("Persik");
        Animal olive = new SphynxCat("Olive");
        System.out.println(persCat.getName());
        System.out.println(persCat.isHappy());
        persCat.say();
        System.out.println(olive.getName());
        System.out.println(olive.isHappy());
        olive.say();
        Cat moorka = new SphynxCat("Moorka");
        System.out.println(moorka.getName());
        System.out.println(moorka.isHappy());
        moorka.say();
        PersianCat barsik = new PersianCat("Barsik");
        System.out.println(barsik.getName());
        barsik.setFurminated(true);
        barsik.setStroked(true);
        System.out.println(barsik.isHappy());
        barsik.setFed(true);
        System.out.println(barsik.isHappy());
        barsik.say();
    }

}
