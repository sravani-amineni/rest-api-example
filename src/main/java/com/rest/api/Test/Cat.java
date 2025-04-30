package com.rest.api.Test;

public class Cat implements Animal,Cloneable
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


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cat()
    {

        System.out.println("cat Default constructor");
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c = new Cat();
        c.setHeight(10);
        System.out.println(c);
        System.out.println(c.getHeight());
        Cat c1 = (Cat) c.clone();
        System.out.println(c1);
        System.out.println(c1.getHeight());

    }
}
