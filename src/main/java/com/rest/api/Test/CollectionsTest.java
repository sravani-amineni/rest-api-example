package com.rest.api.Test;

import java.util.*;


public class CollectionsTest {
    public static void main(String[] args) {
        //arrayListTest();
        //setTest();
        //mapTest();
        // int[] arr={1,3,1,2,2} ;
        //arrayMath(arr);
        List<String> list = new ArrayList<>();
        list.add("vanshi");
        list.add("naresh");
        System.out.println(isExist("naresh", list));
    }
    static void paranthases(String s)
    {

    }

    static boolean isExist(String s, List list) {
        return list.contains(s);
    }

    private static void arrayListTest() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        System.out.println(al.size());
        for (int i = 0; i <= al.size() - 1; i++) {
            System.out.println(i);
        }
        System.out.println("ArrayList ");
    }

    static void setTest() {
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(2);
        System.out.println(s);
        System.out.println(s.size());
        for (int i = 0; i <= s.size() - 1; i++) {
            System.out.println(i);
        }
        System.out.println("HashSet");
    }

    static void arrayMath(int[] arr) {
        System.out.println("printing non-repeating elements");
        HashSet<Integer> hs = new HashSet<>();
        for (Integer i : arr) {
            if (hs.contains(i)) {
                hs.remove(i);
            } else {
                hs.add(i);
                //  System.out.println(i);
            }


        }
        System.out.println(hs);

    }

    static void mapTest() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "sravani");
        map.put(2, "naresh");
        map.put(1, "vanshi");
        map.put(3, "rudhra");

        System.out.println(map);
        System.out.println(map.size());
        for (Map.Entry<Integer, String> s : map.entrySet()) {
            System.out.println(s);

        }
        System.out.println("LinkedHashMap");
    }
}
