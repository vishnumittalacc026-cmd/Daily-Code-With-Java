package com.kundan.day07march2026;

import java.util.stream.IntStream;

public class MainM007 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        String word = "dharmic";

        boolean isPalindrome = IntStream.range(0,word.length()/2)
                .noneMatch(i ->word.charAt(i) !=word.charAt(word.length()-1-i));

        System.out.println(isPalindrome);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
