package com.kundan.day25feb2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main025 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean,List<Integer>> finalResult = list.stream()
                .collect(Collectors.partitioningBy(n -> n%2==0));
        System.out.println(finalResult);
    }
}
