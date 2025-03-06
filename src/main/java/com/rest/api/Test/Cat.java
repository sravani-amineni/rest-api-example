package com.rest.api.Test;

public class Cat implements Animal
{
    private int weight;
    private int height;

    public void sound()
    {
        System.out.println("Meow Meow");
    }
    public void sound(int x,int y)
    {
        System.out.println("print values x=" +x+"y="+y);
    }

    public void eat()
    {
        System.out.println("Cat eats Biscuits");
    }
    Cat(int height,int weight)
    {
        this.height=height;
        this.weight=height;
    }
    Cat()
    {
        System.out.println("Default constructor");
    }
}
