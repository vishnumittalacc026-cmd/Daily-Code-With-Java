package com.kundan.day13march2026;

import java.util.Arrays;
import java.util.List;

public class MainM013 {
    public static void main(String[] args){
        //Start timer
        long startTimer =System.nanoTime();
        List<Integer> numbers = Arrays.asList(1,2,2,1,4,3,6,7);

        List<Integer> unique = numbers.stream()
                .distinct()
                .toList(); // Java 16+
        System.out.println(unique);
        //End Timer
        long endTimer = System.nanoTime();

        //Program Timer
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
