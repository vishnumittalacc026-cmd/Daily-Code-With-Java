package com.kundan.day01march2026;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainM001 {
    public static void main(String[] args){
        //Start timer
        long startTimer = System.nanoTime();
        String input = "java8";

        String reversed = IntStream.rangeClosed(1,input.length())
                .mapToObj(i->input.charAt(input.length()-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(reversed);

        //end timer
        long endTimer = System.nanoTime();

        //program execution time
        long programExectionTime = (endTimer-startTimer)/1_000_000;

        System.out.println("total time for program execution: "+programExectionTime);
    }
}
