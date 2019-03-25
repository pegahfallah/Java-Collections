package com.example.chapter5;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class largestValue {
    public static void largestValue(Map<String, Double> map){

        Set<Double> set = new TreeSet<Double>();
        for(String value : map.keySet()){
            Double v = map.get(value);
            set.add(v);
        }
        System.out.println(set.toString());
        Double last = ((TreeSet<Double>) set).last();
        System.out.println(last);
    }


    public static void main(String[] args) {
        Map<String, Double> a = new TreeMap<>();
        a.put("a",4.);
        a.put("b",3.5);
        a.put("c" , 4.8);
        a.put("d", .4);
        a.put("e", 1.3);
        a.put("f", 465555.);

        largestValue(a);
    }
}
