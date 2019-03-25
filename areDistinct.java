package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class areDistinct {

    public static boolean areDistinct(Map<String,Integer> map){
        //true if all the values of the map are distinct and false otherwise
        //keys of a map are always distinct but values dont need to be
        //transverse the map and store its values in a suitable collection to detect duplication
        boolean b = false;
        List<Integer> noDuplicates = new ArrayList<Integer>(); //create a list
        for(String c : map.keySet()) { //go through each key
            int num = map.get(c); //get the value of each key
            noDuplicates.add(num); //put the value in a list
            for (int i = 0; i < noDuplicates.size(); i++) { //get each now from the list

                int k = noDuplicates.get(i); //get first and second
                int m = noDuplicates.get(i++);

                if (k == m) { //if first is greater remove it and add it at the position of the second
                    b = false;
                } else { //if first is smaller the result is simply the second

                    b = true;

                } //iterate again through to check first and second


            }
        }
        System.out.println(b);
        return b;
    }
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
        System.out.println(distinct);

        return distinct;
    }

    public static void main(String[] args) {
        Map<String, Integer> a = new TreeMap<>();
        a.put("a",24);
        a.put("b",35);
        a.put("c" , 4);
        a.put("d", 44);
        a.put("e", 13);


        areDistinct2(a);

    }
    }
