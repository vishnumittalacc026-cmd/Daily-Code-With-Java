package com.kundan.day25april2026;

public class ArrayQueue {
    int[] arr;
    int front = 0, rear = -1, size = 0, capacity;

    ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void enqueue(int x) {
        if (size == capacity)
            return;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    int dequeue() {
        if (size == 0)
            return -1;
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty. nothing to peek. ");
            return -1;
        }
        return arr[front];

    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    int getSize() {
        return size;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty.");
            return;
        }
        System.out.println("queue element: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[(front + 1) % capacity] + " ");
        }
        System.out.println();
    }
}
