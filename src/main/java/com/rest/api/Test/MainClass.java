package com.rest.api.Test;

public class MainClass {
    public static void main(String[] arg) {
        Animal c = new Cat(10,20);
        Animal d = new Dog();
        MainClass.print(c);
        MainClass.print(d);

        Cat o=new Cat();
        o.sound(1,2);

    }

    static void print(Animal a) {
        a.sound();
        a.eat();

    }
}
