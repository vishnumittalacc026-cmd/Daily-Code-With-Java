package com.kundan.day09march2026;

public class MainM009 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println("hello kundan");
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Total program time: "+programTime+" ms");
    }
}
