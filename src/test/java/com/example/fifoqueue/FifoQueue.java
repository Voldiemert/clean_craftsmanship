package com.example.fifoqueue;

public class FifoQueue {
    private boolean isEmpty = false;
    private int lastElement;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void enqueue(int value) {
        lastElement = value;
    }

    public int peek() {
        return lastElement;
    }

}
