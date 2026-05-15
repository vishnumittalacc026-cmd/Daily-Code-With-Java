package com.kundan.day15may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //end Timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
