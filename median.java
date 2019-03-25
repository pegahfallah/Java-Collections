package com.example.chapter5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class median {
    public static int median(Set<Integer> set){
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for(Integer s: set){
            list.add(s);
        }
        result = list.get(list.size()/2);
        return result;
    }
    public static int median2(Set<Integer> set){
        int result = 0;
        int size = set.size();
        size = size/2 +1;
        Iterator<Integer> itr = set.iterator();
        for(int i = 0; i < size; i++)
        {
            result = itr.next();
        }
        return result;
    }
    public static int median3(Set<Integer> set){
        //  traverse the set: for (int k : set)

        int median = 0;
        for(int k: set) {
            int less = 0;
            int more = 0;
        for(int m : set){
            if(m > k){
                more ++;
            }
            if(m < k){
                less++;
            }
        }
            if(more == less){
                median = k;
            }
        }
        return median;
    }

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(-3);
        a.add(39);
        a.add(396);
        a.add(394);
        System.out.println(median2(a));
    }

}
