package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;

public class list {

    public String demo(){
    List<Integer> three = new ArrayList<Integer>();
        three.add(500);
        three.add(2);
        three.add(424);
        three.add(70);
        three.add(2);
        for (Integer e: three){
            System.out.println(e);
        }
        if(!three.contains(300)){
            three.add(2, 300);
        }
        three.remove(424);
        for (Integer z: three){
            System.out.println(z);
        }
        three.get(4);
        return "";
    }
}
