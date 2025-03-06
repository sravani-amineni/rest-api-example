package com.rest.api.Test;

import java.util.Stack;

public class ClassB {
    static void update(Address address) {
        address.setPincode("2222");

    }

    public static void main(String[] args) {
        Address ad = new Address();
        ad.setPincode("1001");
        System.out.println("pincode:" + ad.getPincode());//1001
        ClassB.update(ad);
        System.out.println(" update  pincode:" + ad.getPincode());//2222

    }
}
