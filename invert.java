package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class invert {
    public static Map<Integer, List<String>> invert(Map<String, Integer> map){
       Map<Integer, List<String>> result = new TreeMap<Integer, List<String>>();
        for(String keys : map.keySet()){
            int v = map.get(keys);
            if(!result.containsKey(keys)){
                List<String> list = new ArrayList<String>();
                list.add(keys);
                result.put(v, list);
            }
            else{
                List<String> contains = result.get(v);
                contains.add(keys);

            }
        }
        return result;
    }

    public static Map<Integer, List<String>> invert2(Map<String, Integer> map){
        Map<Integer, List<String>> result = new TreeMap<Integer, List<String>>();
        for(String k : map.keySet()){
            int v = map.get(k);
            if(!result.containsKey(v)){
                List<String> list = new ArrayList<String>();
                list.add(k);
                result.put(v, list);
            }

            else{
                List<String> existing = result.get(v);
                existing.add(k);
                System.out.println(existing);

            }

        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> a = new TreeMap<String, Integer>();
        a.put("www", 23);
        a.put("yyy", 24);
        a.put("zzz", 23);
        a.put("xxx", 25);

        invert2(a);
    }
}
