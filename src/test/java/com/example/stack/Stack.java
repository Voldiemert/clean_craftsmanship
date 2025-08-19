package com.example.stack;

public class Stack {

    private boolean empty = true;
    private int size = 0;

    public boolean isEmpty() {
        // return false;
        // return empty;
        return size == 0;
    }

    public void push(int element) {
        empty = false;
        size++;
    }

    public int pop() {
        /*empty = true;
        --size;
        return -1;*/
        if (size == 0) {
            throw new Underflow();
        }
        --size;
        return 99;
    }

    public int getSize() {
        // return 0;
        // return 2;
        return size;
    }
}
