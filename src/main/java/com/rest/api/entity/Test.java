package com.rest.api.entity;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        sortStringMethod();
        sortEmpMethod();
    }

    static void sortEmpMethod() {
        System.out.println("Printing the List");
        ArrayList<Emp> ls = new ArrayList<>();
        Emp obj = new Emp(40000,"sravani");
        Emp obj1 = new Emp(10000,"naresh");
        Emp obj2 = new Emp(20000,"sravani");
        ls.add(obj);
        ls.add(obj1);
        ls.add(obj2);
        System.out.println(ls);
        for (int i = 0; i < ls.size(); i++) {
            System.out.println("Before sorting:" + ls.get(i));

        }

        Collections.sort(ls);
        for (int i = 0; i < ls.size(); i++) {

            System.out.println("After sorting:" + ls.get(i));
        }
    }


    static void sortStringMethod() {
        System.out.println("Printing the List");
        ArrayList<String> ls = new ArrayList<>();
        ls.add("sravani");
        ls.add("naresh");
        ls.add("vanshi");
        System.out.println(ls);
        for (int i = 0; i < ls.size(); i++) {
            String s = ls.get(i);
            System.out.println("Before sorting:" + s);

        }


        Collections.sort(ls);
        for (int i = 0; i < ls.size(); i++) {
            String s = ls.get(i);

            System.out.println("After sorting:" + s);
        }


    }

    static class Emp implements Comparable<Emp> {
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Emp(int salary, String name) {
            this.salary = salary;
            this.name = name;
        }


        @Override
        public int compareTo(Emp o) {
            if (this.name.equals(o.name)) {
                return this.salary - o.salary;
            }

            return this.name.compareTo(o.name);
        }

        public String toString() {
            return this.salary + "" +this.name + "";
        }

    }


}
