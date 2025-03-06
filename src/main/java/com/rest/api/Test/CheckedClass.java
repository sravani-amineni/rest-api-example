package com.rest.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedClass
{
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("file.txt"); // Might throw FileNotFoundException
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());

        }
    }
}
