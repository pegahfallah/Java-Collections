package com.example.chapter5;

import java.util.Set;
import java.util.TreeSet;

public class intersect {
    public static Set<String> intersect(Set<String> set1, Set<String> set2){
        Set<String> result = new TreeSet<String>();
        //transverse one set
        // whenever you visit an element search for it in the other set
        // see if it is present and if so add it to the result set

        //take two sets of integers and return a set if their common elements
        for(String s1 :set1){
            for (String s2: set2){
              //  System.out.println(s2);

                if(s1.equals(s2)){
                    result.add(s2);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> a = new TreeSet<>();
        a.add("1");
        a.add("2");
        a.add("ws");
        a.add("S");
        a.add("D");
        Set<String> b = new TreeSet<>();
        b.add("2");
        b.add("ws");
        b.add("S");
        b.add("k");
        System.out.println(intersect(a, b));
    }

}
