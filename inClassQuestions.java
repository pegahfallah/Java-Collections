package com.example.chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class inClassQuestions {
    public static int missing1(List<Integer> list) {
        int result = 0;
        int n = list.size() + 1;
        for (int i = 1; (i <= n) && (result == 0); i++) { //go through the list starting at 1 until the last number
            if (!list.contains(i)) { //if the list doesnt contain that number
                result = i;  //result is the missing number
                //stop the loop
            }
        }
        return result;
    }

    public static int missing2(List<Integer> list)
    {
        Collections.sort(list);

        int result = 0;
        int count = 0;
        for (int i : list) //iterate through the sorted list
        {
            count++; //increase by 1
            if (count != i) //if 1 = 1 then true, 2 = 2, true , 3 = 3, 4 != 5 then 4 is missing number
            {
                result = count;
            }
        }
        // check if missing is n (see forum at:
        // https://moodle.yorku.ca/moodle/mod/forum/discuss.php?d=1173252
        return result;
    }
    // Same but benefit from arithmetic series sum
    // This works as-is for sets and lists
    // Complexity O(N)
    public static int missing3(List<Integer> list)
    {
        int n = list.size() + 1;
        int math = n*(n+1) / 2;
        int sum = 0;
        for (int k : list)
        {
            sum += k;
        }
        int result = math - sum;
        return result;
    }

    // return a map whose keys are the words in the string
    // with values = #of occurrences of each
//    public static Map<String, Integer> freq(String s)
//    {
//        String regex = "[^A-Za-z]+";
//        String[] words = s.split(regex);
//        List<String> list = Arrays.asList(words);
//
//    }


    public static void main(String[] args) {

       /** Map<String,String> map = new TreeMap<String,String>();
        map.put("Toronto", "Ontario");
        map.put("Montreal", "Quebec");
        map.put("Ottawa", "Ontario");
        System.out.println(map);
        System.out.println(map.containsKey("Toronto"));
        System.out.println(map.containsKey("Kingston"));
        map.remove("Toronto");
        System.out.println(map);
        System.out.println(map.get("Ottawa"));
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // use the sugar:
        for (String k : map.keySet())
        {
            String v = map.get(k);
            System.out.println("Key=" + k + ", Value=" + v);
        }

        // use the real iterator
        for (Iterator<String> itr = map.keySet().iterator(); itr.hasNext();)
        {
            String k = itr.next();
            String v = map.get(k);
            System.out.println("Key=" + k + ", Value=" + v);
        }
        **/
            List<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(2);
            a.add(3);
            a.add(5);
            a.add(6);
            a.add(7);

            System.out.println(missing1(a));

    }
}
