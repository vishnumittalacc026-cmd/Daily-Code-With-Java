package com.kundan.day12march2026;

public class Application001 {
    public static void main(String[] args){
        //Start Timer
        long startTimer = System.nanoTime();
        //Creating virtual thread using Thread.startVirtualThread()
        Thread virtualThread =Thread.startVirtualThread(()->{
            System.out.println("Running in virtual thread: "+Thread.currentThread());
        });
        try {
            virtualThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
