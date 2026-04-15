package com.kundan.day15april2026;

public class MainApr015 {
    //recursive method
    static Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next =null;
        return newHead;
    }
    //Utility method
    static void printList(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        // start time
        long startTimer = System.nanoTime();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("original List: ");
        printList(head);

        head =reverse(head);
        System.out.println("Reversed List: ");
        printList(head);
        //end time
        long endTimer = System.nanoTime();

        // program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
