package com.java8.practice;

import java.util.HashSet;

class Test {


    public static void main(String[] args) {
        HashSet<String> l = new HashSet<String>();
        l.add("Sunny");
        l.add("Bunny");
        l.add("Chinny");
        l.add("Sunny");
        System.out.println(l);
    }
}
