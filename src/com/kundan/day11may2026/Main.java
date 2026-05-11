package com.kundan.day11may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //reverse the string

        String str = "hello";
        String reversed = "";

        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
