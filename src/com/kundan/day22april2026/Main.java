package com.kundan.day22april2026;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //using java build-in Queue interface
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.peek());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
