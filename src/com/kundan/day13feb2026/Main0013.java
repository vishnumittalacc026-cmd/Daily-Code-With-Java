package com.kundan.day13feb2026;

import java.util.*;

public class Main0013 {
    public static void main(String[] args) {
//    String[] words = {"eat", "teat","tan","ate","nat","bat","hat"};
//
//        Map<String, List<String>>  map = new HashMap<>();
//
//        for(String word:words){
//            char[] chars = word.toCharArray();
//            Arrays.sort(chars);
//            String key = new String(chars);
//
//            map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
//        }
//        System.out.println(map.values());

        // sort hashmap by value

        Map<String,Integer> map = new HashMap<>();
        map.put("A",90);
        map.put("B",1);
        map.put("C",20);
        map.put("D",4);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String,Integer> entry:list){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
