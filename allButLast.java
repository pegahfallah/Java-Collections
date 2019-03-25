package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;

public class allButLast {

    public static void allButLast(List<String> list)
    {
        //remove all but the last element
        List<String> list2 = new ArrayList<String>();
        list2.add(list.get(list.size()-1));
        list.clear();
        list.addAll(list2);

    }

    public static void allButLast2(List<String> list) {
        while (list.size() > 1) {
            list.remove(0);
        }
    }

    public static void allB(List<String> list){
        while(list.size()>1){
        list.remove(0);
        }
    }
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");

        allButLast(a);
    }
}
