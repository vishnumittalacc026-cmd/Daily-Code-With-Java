package com.kundan.day30march2026;

public class MainM030 {
    public static void main(String[] args){
        //Strat Timer
        long startTimer = System.nanoTime();

        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
