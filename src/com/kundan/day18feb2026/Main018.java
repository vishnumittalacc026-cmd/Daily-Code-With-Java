package com.kundan.day18feb2026;

import java.util.HashMap;

public class Main018 {
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        int left =0;
        int maxLength =0;

        for(int right =0; right<s.length();right++){
            char currentChar = s.charAt(right);

            if(map.containsKey(currentChar)){
                left = Math.max(left, map.get(currentChar)+1);
            }
            map.put(currentChar,right);
            maxLength =Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

   public static void main(String[] args){
       String s = "abcabcbb";
       System.out.println("Longest substring length: "+lengthOfLongestSubstring(s));
   }
}
