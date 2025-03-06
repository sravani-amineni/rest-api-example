package com.rest.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsClass
{
    public static void readFile() throws IOException {
        FileReader file = new FileReader("file.txt");
        file.read();
        file.close();
    }

    public static void main(String[] args) {
        try {
            //readFile();
            System.out.println("this is try");
        } catch (Exception e) {
            System.out.println("Handled exception: " + e.getMessage());
        }finally {
            System.out.println("this is finally");
        }
    }
}
