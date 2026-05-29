package com.kundan.day29may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();
        lst.insert(1);
        lst.insert(9);
        lst.insert(5);

        lst.display();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer);

        System.out.println("program time: "+programTime+" ms");
    }
}
