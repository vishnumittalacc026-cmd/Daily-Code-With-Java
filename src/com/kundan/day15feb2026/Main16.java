package com.kundan.day15feb2026;

import java.util.Arrays;
import java.util.List;

public class Main16 {
    public static void main(String[] args){
//        List<Integer> list = Arrays.asList(10,11,12,15);
//
//        list.forEach(n ->System.out.println(n));
// even numbers using lambda
//        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        list.stream()
//                .filter(n -> n%2 ==0)
//                .forEach(System.out::println);

        // sot list of strings a
//        List<String> names = Arrays.asList("rohit","amit","vishnu");
//
//        names.sort((a,b) -> a.compareTo(b));
//        System.out.println(names);

        List<String> list =Arrays.asList("Amit","vishnu","ankit","raju");

        long count = list.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(count);
    }
}
