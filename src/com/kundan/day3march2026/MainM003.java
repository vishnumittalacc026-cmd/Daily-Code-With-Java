package com.kundan.day3march2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainM003 {
    public static void main(String[] args){

        //start timer
        long startTimer = System.nanoTime();
        String input = "aabccdeff";

        Character result = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('_');
        System.out.println(result);

        //end timer
        long endTimer = System.nanoTime();

        //time taken
        long totalTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Total time taken for program execution: "+totalTime+" millisecond");
    }
}
