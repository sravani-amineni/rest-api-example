package com.rest.api.Test;

public class Unchecked
{
    public static void main(String[] args) {
        int a = 10, b = 0;
        int result = a / b; // This will throw ArithmeticException
        System.out.println(result);
    }
}
