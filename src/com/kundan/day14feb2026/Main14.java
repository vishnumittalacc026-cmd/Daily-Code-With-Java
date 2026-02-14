package com.kundan.day14feb2026;

import java.util.function.Predicate;

public class Main14 {
    public static void main(String[] args){
        //Predicate
        //takes one argument and return boolean
        // boolean test(T t)

        Predicate<Integer> isEven = n->n%2 ==0;

        System.out.println(isEven.test(12));
        System.out.println(isEven.test(9));

    }
}
