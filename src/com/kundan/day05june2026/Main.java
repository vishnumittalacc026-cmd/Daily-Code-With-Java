package com.kundan.day05june2026;

import com.kundan.day04june2026.LinkedList;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();

        lst.insertNode(9);
        lst.insertNode(8);
        lst.insertNode(6);
        lst.insertNode(4);
        lst.insertNode(1);
        lst.insertNode(5);


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
