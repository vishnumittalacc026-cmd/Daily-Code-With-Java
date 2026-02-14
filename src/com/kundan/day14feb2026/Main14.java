package com.kundan.day14feb2026;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main14 {
    public static void main(String[] args){
        //Predicate
        //takes one argument and return boolean
        // boolean test(T t)

//        Predicate<Integer> isEven = n->n%2 ==0;
//
//        System.out.println(isEven.test(12));
//        System.out.println(isEven.test(9));

//        // filter using predicate with stream
//
//        List<Integer> numbers = List.of(10,15,20,11,16,21);
//
//        numbers.stream()
//                .filter(n-> n>20)
//                .forEach(System.out::println);

        // Functional Method
        // takes one input and return one output
        // R apply(T t)

        Function<String,Integer> lengthFunction = s -> s.length();
        System.out.println(lengthFunction.apply("java"));
        System.out.println(lengthFunction.apply("Spring"));
    }
}
