package com.example.chapter5;

import java.util.Set;
import java.util.TreeSet;

public class set {

    public static String demo(int w, int a){
    Set<Integer> demo = new TreeSet<>();
    demo.add(500);
    demo.add(2);
    demo.add(450);
    demo.add(2);
    demo.add(70);
    System.out.println(demo.size());
    System.out.println(demo.contains(a));
    demo.remove(w);
    System.out.println(demo.size());
        String yo ="";
        for(Integer e : demo) {
        System.out.println(e);
    }
    return yo;
    }

    public static void main(String[] args) {
        System.out.println(demo(450,450));
    }
}

