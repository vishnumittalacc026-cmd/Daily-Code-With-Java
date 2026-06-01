package com.kundan.day01june2026;

public class LinkedList {
    Node head;

    //insert data
    public void insertNode(int element){
        Node newNode = new Node(element);

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

    //traverse
    public void traverse(){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("EndOfLinkedList");
    }
}
