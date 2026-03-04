package com.kundan.day04march2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainM004 {
    public static void main(String[] args){
        // Start timer
        long startTimer = System.nanoTime();
        List<Integer> numbers = Arrays.asList(1,8,2,11,8,15,12,10,0,17);
        Integer secondHightestNumber = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second highest number is: "+secondHightestNumber);
        //Program time: 111
        //End timer
        long endTimer = System.nanoTime();

        //Program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Program time: "+programTime);
    }
}
