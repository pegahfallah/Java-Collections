package com.example.chapter5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class closest {
    //given a list of two or more integers
//    return a set containing the 2 integers in the list that are the closest to eachother ie
// the absolute value of the difference between them is minimal
    public static Set<Integer> closest2(List<Integer> list){
        Collections.sort(list);
        int num1 = list.get(0);
        int num2 = list.get(1);
        int difference = Math.abs(num1-num2);
        for (int i:list){
            for(int j:list){
                if (j>i && difference>j-i){
                    difference = j-i;
                    num1 = i;
                    num2 = j;
                }
            }
        }
        Set<Integer> set = new TreeSet<>();
        set.add(num1);
        set.add(num2);
        System.out.println(set);

        return  set;
    }

    public static Set<Integer> closestt(List<Integer> list) {
    int first = list.get(0);
    int second = list.get(1);
    int difference = Math.abs(second-first);
    for(Integer e: list){
        for(Integer f:list){
            if(f>e && difference>f-e){
                first= e;
                second = f;
                difference = f-e;
                }
            }
        }
        Set<Integer> set = new TreeSet<>();
        set.add(first);
        set.add(second);
        System.out.println(set);

        return set;
    }



        public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(21);
        a.add(4);
        a.add(2);
        a.add(12);
        a.add(18);
        a.add(24);
        a.add(16);
        a.add(7);
        a.add(20);
        a.add(39);
        a.add(-3);
        a.add(26);

        closestt(a);
    }
}
