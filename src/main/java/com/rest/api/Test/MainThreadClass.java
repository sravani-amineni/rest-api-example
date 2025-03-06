package com.rest.api.Test;

public class MainThreadClass implements Runnable
{
    public void run()
    {
        System.out.println("run method executed");
    }
    public static void main(String[] args)
    {
       MainThreadClass i=new MainThreadClass();
      // t.start();
    }
}
