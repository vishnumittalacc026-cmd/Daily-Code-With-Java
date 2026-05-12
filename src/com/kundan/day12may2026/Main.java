package com.kundan.day12may2026;

public class Main {
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(12);

        root.left.left = new Node(13);
        root.left.right = new Node(14);

        System.out.println("Tree Created");

        System.out.println("Inorder Traversal: ");
        inorder(root);
        System.out.println();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
