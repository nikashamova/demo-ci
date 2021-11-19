package ru.nsu.ci.inheritance;

public class Parent {

    protected String str;

    public Parent(String str) {
        this.str = str;
        System.out.println("Parent parameter constructor!");
    }

    void printStr() {
        System.out.println(str);
    }

}
