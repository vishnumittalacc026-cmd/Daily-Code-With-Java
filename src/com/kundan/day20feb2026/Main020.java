package com.kundan.day20feb2026;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main020 {

public static char findFirstNonReaption(String input){
    Optional<Character> result = input.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(
                            Function.identity(),
                            LinkedHashMap::new,
                            Collectors.counting()
            ))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue()==1)
            .map(Map.Entry::getKey)
            .findFirst();

    return result.orElse('-');
}
    public static void main(String[] args){
        String input = "aabcbcdede";
        System.out.println(findFirstNonReaption(input));
    }
}
