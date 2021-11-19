package ru.nsu.ci.inheritance;

public class Child extends Parent {

    private String childStr1;
    private String childStr2;

    public Child() {
        super("any str");
        System.out.println("Child empty Constructor!");
    }

    public Child(String str) {
        this();
        super.str = "from child: " + str;
        childStr1 = str;
        // на самом деле не обязательно использовать this ниже,
        // но это улучшает читаемость
        this.childStr2 = str;
        System.out.println("Child parameter Constructor!");
    }

    void printChildStr1() {
        super.printStr();
        System.out.println(childStr1);
    }

    void printChildStr2() {
        // 2 строчки ниже делают одно и то же
        printChildStr1();
        this.printChildStr1();
        System.out.println(childStr1);
        System.out.println(childStr2);
    }
}
