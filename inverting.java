package com.example.chapter5;

import java.util.Map;
import java.util.TreeMap;

public class inverting {

    public static Map<Integer, String> invert(Map<String, Integer> map){

        Map<Integer, String> result = new TreeMap<Integer, String>();
        for(String k: map.keySet()){ //return keys of all pairs
            int v = map.get(k); //return value of pair w key k if present

            if(!result.containsKey(v)){ //never encountered before
                result.put(v,k); //place the value, key into map that used to be key, value
            }
           else{ //if the name of the station is smaller then insert it into result  otherwise do nothinf
               String existing = result.get(v);
               if(k.compareTo(existing)<0)  //keep smaller key

               {
                   result.put(v, k);
               }
            }
        }
        return result;
    }
}
