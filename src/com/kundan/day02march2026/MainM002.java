package com.kundan.day02march2026;

import java.util.*;
import java.util.stream.Collectors;

public class MainM002 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //Find Duplicate Elements in List.
        List<Integer> list = Arrays.asList(1,2,3,4,5,4,5,6,7,2,9,1);

//        Set<Integer> duplicates = list.stream()
//                .filter(n -> Collections.frequency(list,n)>1)
//                .collect(Collectors.toSet());
//        System.out.println(duplicates);

        //second approach
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();

        for(Integer n:list){
            //if we've already seen this number,it's a duplicate
            if(!seen.add(n)){
                duplicates.add(n);
            }
        }
        System.out.println(duplicates);
        //end timer
        long endTimer = System.nanoTime();

        //execution time
        long executionTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Execution time for program: "+executionTime);
    }
}
