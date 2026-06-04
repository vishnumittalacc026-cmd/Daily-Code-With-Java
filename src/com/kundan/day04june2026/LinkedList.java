package com.kundan.day04june2026;

public class LinkedList {
    Node head;

    //insert in the Node
    public void insertNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //find the middle Node

    //print the LinkedList
    public void printLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
