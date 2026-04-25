package com.kundan.day25april2026;

public class ArrayQueue {
    int[] arr;
    int front =0, rear = -1, size =0, capacity;

    ArrayQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void enqueue(int x){
        if(size == capacity)
            return;
        rear = (rear+1) % capacity;
        arr[rear] = x;
        size++;
    }
    int deque(){
        if(size == 0)
            return -1;
        int val = arr[front];
        front = (front+1)%capacity;
        size--;
        return val;
    }
}
