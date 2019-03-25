package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class areDistinct2 {
    public static boolean areDistinct2(Map<String, Integer> map){
        List<Integer> storingList = new ArrayList<Integer>();
        boolean distinct = false;
        for(String key : map.keySet()) {
            int number = map.get(key);
            if (!(storingList.contains(number))) {
                storingList.add(number);
                distinct = true;
            }
            else{
                distinct = false;
           }
        }
        return distinct;
    }


    public static void main(String[] args) {
        Map<String, Integer> a = new TreeMap<>();
        a.put("a",24);
        a.put("b",4);
        a.put("c" , 14);
        a.put("d", 44);
        a.put("e", 13);
        a.put("f", 14);
//        a.put("f", 13);
//        a.put("g", 13);

        System.out.println(areDistinct2(a));

    }
}
