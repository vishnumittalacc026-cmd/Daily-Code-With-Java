package com.kundan.day14march2026;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainM014 {
    public static void main(String[] args){
        String sentence = "java is good java is powerful programming language";

        Map<String,Long> map =
                Arrays.stream(sentence.split(" "))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));
        System.out.println(map);
    }
}
