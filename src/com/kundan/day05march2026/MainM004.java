package com.kundan.day05march2026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MainM004 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        Map<String,Integer> map = new HashMap<>();
        map.put("A",3);
        map.put("B",1);
        map.put("C",2);

        Map<String,Integer> sorted = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) ->e1,
                        LinkedHashMap::new
                ));
        System.out.println(sorted);

        //end timer
        long endTimer =System.nanoTime();
        //Program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
