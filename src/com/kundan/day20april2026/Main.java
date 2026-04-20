package com.kundan.day20april2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //end Timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println(programTime);
    }
}
