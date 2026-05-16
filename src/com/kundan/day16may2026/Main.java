package com.kundan.day16may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        BSTInsertion bst = new BSTInsertion();
        Node root = null;

        root = bst.insert(root, 50);
        bst.insert(root, 10);
        bst.insert(root,11);
        bst.insert(root,70);
        bst.insert(root,12);
        bst.insert(root,100);
        bst.insert(root,99);

        System.out.println("Inorder Traversal: ");
        bst.inorder(root);
        System.out.println();


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time:" + programTime+" ms");
    }
}
