package com.example.fifoqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FifoQueueTests {
    FifoQueue fifoQueue = new FifoQueue();

    @Test
    public void givenFifoQueue_thenItIsEmpty() {
        assertTrue(fifoQueue.isEmpty());
    }

    @Test
    public void givenFifoQueue_whenAddingElement_thenItIsNotEmpty() {
        fifoQueue.enqueue(1);
        assertFalse(fifoQueue.isEmpty());
    }

    @Test
    public void givenFifoQueue_whenAddingElement_thenPeekReturnsAddedElement() {
        fifoQueue.enqueue(1);
        assertEquals(1, fifoQueue.peek());
    }
}

// Can create empty queue – check that a new queue is empty.
//
// Enqueue single element – after enqueue, size should be 1, peek() returns the element.
//
// Dequeue single element – enqueue then dequeue, queue should be empty.
//
// FIFO order – enqueue multiple
