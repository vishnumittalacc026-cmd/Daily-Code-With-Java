package com.kundan.day27feb2026;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main027 {
    public static void main(String[] args){
        //start timer
        long startingTime = System.nanoTime();

//        int number = 124356798;
//
////        int sum = String.valueOf(number)
////                        .chars()
////                                .map(Character::getNumericValue)
////                                        .sum();
//        //second approach
//        int sum=0;
//        while(number>0){
//            sum = sum+number%10;
//            number= number/10;
//        }
//        System.out.println(sum);

        //Removing Duplicate String from list
        List<String> list = Arrays.asList("orange","apple","apple","cherry","papaya");

        List<String> finalResult= list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(finalResult);

        //end timer
        long endingTime = System.nanoTime();
        //program time
        long timeTaken = (endingTime-startingTime)/1_000_000;

        System.out.println("Time taken: "+timeTaken+"ms");
    }
}
