package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class largest {


    public static int largest(Set<Integer> set) {

        int result =  0;
        List<Integer> list = new ArrayList<Integer>();

        for (Integer j : set) {

            list.add(j); //add each element of the given set to j
        }
        for (int i = 0; i < set.size() ; i++) { //get each now from the list

            int k = list.get(i); //get first and second
            int m = list.get(i++);

            if (k>m){ //if first is greater remove it and add it at the position of the second
                list.remove(k);
                list.add(i++,k);

                result =  k;
            }
            else { //if first is smaller the result is simply the second

                result =  m;

            } //iterate again through to check first and second


        }
        return result;
    }


    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(-3);
        a.add(39);
        System.out.println(largest(a));
    }
}
