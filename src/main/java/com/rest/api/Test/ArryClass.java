package com.rest.api.Test;

import java.util.ArrayList;

public class ArryClass
{
    public static void main(String[] args){
        ArrayList<Address> al=new ArrayList<Address>();
        for (int i=1;i<=100;i++){
            Address a =new Address();
            a.setPincode(i+"");

            al.add(a);

        }
        System.out.println(al);


        ArrayList<Integer> alInteger=new ArrayList<>();
        for (Integer i=1;i<=100;i++){
           Integer i1 = new Integer(i);
            alInteger.add(i1);
        }
        System.out.println(alInteger);


    }

}
