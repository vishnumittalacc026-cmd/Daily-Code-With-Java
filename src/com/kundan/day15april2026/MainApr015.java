package com.kundan.day15april2026;

public class MainApr015 {
    public static void main(String[] args){
        // start time
        long startTimer = System.nanoTime();

        //end time
        long endTimer = System.nanoTime();

        // program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
