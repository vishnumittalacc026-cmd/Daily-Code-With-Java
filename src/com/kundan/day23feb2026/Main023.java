package com.kundan.day23feb2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main023 {
    public static void main(String[] args){
        String input = "Programming in java";

        Map<Character,Long> frequency =
                input.chars()
                        .mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));
        System.out.println(frequency);
    }
}
