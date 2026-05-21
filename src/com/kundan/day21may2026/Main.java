package com.kundan.day21may2026;

public class Main {
    public static void main(String[] args){
        //Start Timer
        long startTimer = System.nanoTime();

        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
