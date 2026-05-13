package com.kundan.day13may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left= new Node(4);
        root.left.right= new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Tree created");

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
