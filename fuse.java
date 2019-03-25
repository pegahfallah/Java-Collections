package com.example.chapter5;

import java.util.Map;
import java.util.TreeMap;

public class fuse {
    public static Map<String, Integer> fuse(Map<String, Integer> map1,Map<String, Integer> map2){
        //2 maps retyn a map whose keys are the common keys between them and whose values are the larger if the two values of the common keys
        Map<String, Integer> result = new TreeMap<String, Integer>();
        int value = 0;
        for(String key : map1.keySet()){
                if(map2.containsKey(key)){
                    if(map2.get(key)>map1.get(key))
                    result.put(key, map1.get(key));
                }
                else {
                    result.put(key, map1.get(key));

            }
            }
        System.out.println(result.toString());
        return result;
    }
    public static Map<String, Integer> fuse2(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (String s : map1.keySet()) {
            if (map2.containsKey(s)) {
                if (map2.get(s) > map1.get(s)) {
                    map.put(s, map2.get(s));
                } else {
                    map.put(s, map1.get(s));
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> a = new TreeMap<>();
        a.put("may",2);
        a.put("screen",3);
        a.put("c" , 4);

        Map<String, Integer> b = new TreeMap<>();
        a.put("may",7);
        a.put("screen",2);
        a.put("d" , 44);

        fuse(a,b);
    }
}
