package com.rest.api.Test;

public class ClassA {
    int i;

    public void update( int x,int y)
    {

        x=55;
        y=66;
        System.out.println("printed "+i);

    }
    public static void main(String arg[])
    {

        ClassA obj=new ClassA();
        int x=10;
        int y=20;
        System.out.println("x= "+x+"y= "+y);
        obj.update(x,y);

        System.out.println("x= "+x+"y= "+y);
    }


}
