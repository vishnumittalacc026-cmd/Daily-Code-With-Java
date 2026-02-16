package com.kundan.day16fab2026;

import java.util.HashMap;

public class Main16 {

    public static int firstUniChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        //counting frequency of each type of charter in the string
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        // finding first character with non frequency is one
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String s = "loveleetcode";

        int a = firstUniChar(s);

        System.out.println(s.charAt(a));
    }
}
