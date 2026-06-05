package com.kundan.day05june2026;

public class LinkedList {
    Node head;

    //add the data in the node of Linked List
    public void insertData(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //checking loop exist in the Linked List


}
