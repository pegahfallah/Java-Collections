package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class allkeys {
    public static Map<Integer, List<String>> invert(Map<String, Integer> map) {
    Map<Integer, List<String>> result = new TreeMap<Integer, List<String>>();
    for (String k : map.keySet()){ //transverse the given map
        int v = map.get(k);
        if(!result.containsKey(v)){ //not present in result then insert v,list
            List<String> list = new ArrayList<String>();
            list.add(k);
            result.put(v, list);

        }
        else //encountered before so insert k to the existing list
        {
            List<String> existing = result.get(v);
            existing.add(k);

        }
        }
        return result;
    }
}
