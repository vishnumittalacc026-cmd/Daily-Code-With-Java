package com.kundan.day13feb2026;

import java.util.*;

public class Main0013 {
    public static void main(String[] args) {
    String[] words = {"eat", "teat","tan","ate","nat","bat","hat"};

        Map<String, List<String>>  map = new HashMap<>();

        for(String word:words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
        }
        System.out.println(map.values());
    }
}
