package com.example.chapter5;

import java.util.Map;
import java.util.TreeMap;

public class stats {
    public static Map<String, Integer> charStats(String s){
        Map<String,Integer> result = new TreeMap<String, Integer>();//empty map
        for(int p=0; p < s.length();p++){ //transverses string character by character
            String c = s.substring(p, p+1);
            if(!result.containsKey(c)) //check if it has already been encountered
            {
                result.put(c,1); //if not then store it in the map
            }
            else{
                int oldFreq = result.get(c); //if it contains retrieve its value increment the frequenncy  and store the pair back
                int newFreq = oldFreq + 1;
                result.put(c, newFreq);

            }
        }
        return result;

    }
}
