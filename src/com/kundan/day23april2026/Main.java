package com.kundan.day23april2026;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        dq.addFirst(2);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeFirst());

        dq.addFirst(3);
        dq.addLast(4);
        dq.addFirst(5);
        dq.addFirst(6);
        dq.addLast(7);

        System.out.println("Deque after additions: "+dq);

        System.out.println("Removed first: "+ dq.removeFirst());
        System.out.println("Removed last: "+dq.removeLast());

        System.out.println("final deque: "+dq);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");

    }
}
