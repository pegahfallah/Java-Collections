package com.example.chapter5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class latestbyWeekday {
        public static Map<String, Date> latestByWeekday(List<Date> list){ // O(N)
            Map<String, Date> result = new TreeMap<>();
            for(Date d: list) // O(N)
            {
                String day = d.toString().substring(0, 3);
                if(!result.containsKey(day)) { // O(lgN)
                    result.put(day, d); // O(lgN)
                }
                else if (d.compareTo(result.get(day)) < 0)
                {
                    result.put(day, d); // O(lgN)
                }
            }
            return result;
        }
    public static Map<String, Date> latestByWeekday2(List<Date> list) { // O(N)
            Map<String, Date> map = new TreeMap<String, Date>();
            for(Date d : list){
                String day = d.toString().substring(0,3);
                if(!map.containsKey(day)){
                    map.put(day, d);
                }
                else if(d.compareTo(map.get(day))<0){
                    map.put(day, d);
                }
        }
        return map;

    }


    }
