package com.kundan.day26feb2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main026 {
    public static void main(String[] args){
        //Start timer
        long startTimer = System.nanoTime();

        List<String> words = Arrays.asList("java","go","c#","c","c++","Rust","python","javascript");
        //1st approach
//        Optional<String> longest = words.stream()
//                .max(Comparator.comparingInt(String::length));
//
//        longest.ifPresent(System.out::println);
        //second approach
        String longest = null;
        for(String word:words){
            if(longest==null || word.length()>longest.length()){
                longest=word;
            }
        }

        if(longest!=null){
            System.out.println("longest string: "+longest);
        }
        //Total time duration of program execution 1 ms

        //End timer
        long endTimer =System.nanoTime();

        //calculate program execution time in millisecond
        long durationInMilliSecond = (endTimer-startTimer)/1_000_000;

        //printing the output of program
        System.out.println("Total time duration of program execution "+durationInMilliSecond+" ms");
    }
}
