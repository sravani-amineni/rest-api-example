package com.rest.api.Test;

public class SubClass extends SuperClass
{
    public void meth1()
    {
        System.out.println("Abstract class");
    }
    public static void main(String[] args){
      SubClass sub=new SubClass();
      sub.meth1(10);
    }
}
