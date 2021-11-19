package ru.nsu.ci.inheritance;

public class Example {

    public static void main(String[] args) {
        Parent parent = new Parent("parent");
        Child child1 = new Child();
        Child child2 = new Child("child");
        parent.printStr();
        child1.printStr();
        child2.printStr();
        child2.printChildStr1();
        child2.printChildStr2();
    }

}
