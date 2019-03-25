package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class mostOccurring {

    public static List<Integer> mostOccuring(List<Integer>bag)
    {
        List<Integer> result = new ArrayList<Integer>(); //make a list result
        Set<Integer> set = new TreeSet<>(); //make a set
        List<Integer> recurring = new ArrayList<Integer>(); //make a list to store the recurring
        recurring.addAll(bag); //add every element of bag to the list
        int v = 0; //start with most occurring at 0
        for (int i : bag) //transverse bag list
        {
            int count = 0; //set ur count to 0
            for (int k : recurring) //transverse the other lost
            {
                if (k==i) //if you see one in the recurring that matches the original increase count
                {
                    count++;
                }
                v = Math.max(count,v); //get the max
            }
        }
        for (int g: bag)
        {
            int count = 0;
            for (int k : recurring)
            {
                if (k==g)
                {
                    count++;
                }
                if (count == v)
                {
                    set.add(g);
                }
            }
        }
        result.addAll(set);
        return result;
    }

    public static List<Integer> mostOccuring2(List<Integer>bag) {
     int count = 1;
     Map<Integer, Integer> counter = new TreeMap<Integer, Integer>();
     List<Integer> result = new ArrayList<Integer>();
     for(Integer one : bag){
         if(!counter.containsKey(one)){
             counter.put(one , count);
         }
         else{
             int oldFreq = counter.get(one);
             int newFreq = oldFreq +1;
             counter.put(one, newFreq);
         }
     System.out.println(counter.toString());
     }

     return result;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(7);
        a.add(5);
        a.add(34);
        a.add(34);
        a.add(34);
        a.add(32);
        a.add(35);
        a.add(32);

        mostOccuring2(a);
    }
}
