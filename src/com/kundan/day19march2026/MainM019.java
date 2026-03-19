package com.kundan.day19march2026;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainM019 {
    public static String secondLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int left = 0;
        List<String> substrings = new ArrayList<>();

        for(int right =0; right<s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            substrings.add(s.substring(left,right+1));
        }
        //sort substrings by length(descending), then remove duplicates
        List<String> uniqueSorted = substrings.stream()
                .distinct()
                .sorted((a,b)->Integer.compare(b.length(),a.length()))
                .toList();
        return uniqueSorted.size()>1?uniqueSorted.get(1):"";
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        String s="abcabcbb";
        String result = secondLongestSubstring(s);
        System.out.println("Second longest substring: "+result);
        System.out.println("Length: "+result.length());
        //end timer
        long endTimer = System.nanoTime();
        //program timer
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Timer: "+programTime+" millisecond");
    }
}
