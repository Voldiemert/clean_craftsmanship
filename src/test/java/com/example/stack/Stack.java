package com.example.stack;

public class Stack {

    private boolean empty = true;
    private int size = 0;
    private int[] elements = new int[2];

    public boolean isEmpty() {
        // return false;
        // return empty;
        return size == 0;
    }

    public void push(int element) {
        this.elements[size++] = element;
    }

    public int pop() {
        /*empty = true;
        --size;
        return -1;*/
        if (size == 0) {
            throw new Underflow();
        }
        return elements[--size];
    }

    public int getSize() {
        // return 0;
        // return 2;
        return size;
    }
}
