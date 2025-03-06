package com.rest.api.Test;

public class ThreadClass extends Thread
{
    public void run()
    {
       System.out.println("Thread run method");
    }
    public static void main(String[] args)
    {
        Thread t=new Thread();
        t.start();
    }
}
