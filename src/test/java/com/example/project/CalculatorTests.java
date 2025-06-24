/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {

    private Stack stack = new Stack();

    @Test
    public void canCreateStack() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_stackIsNotEmpty() throws Exception {
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void afterOnePushOnePop_stackIsEmpty() throws Exception {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void afterTwoPushes_stackSizeIsTwo() throws Exception {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void poppingFromEmptyStackThrowsUnderflow() throws Exception {
        assertThrows(Stack.Underflow.class, () -> stack.pop());
    }

    @Test
    public void afterPushingX_willPopX() throws Exception {
        stack.push(42);
        assertEquals(42, stack.pop());
        stack.push(300);
        assertEquals(300, stack.pop());
    }

    @Test
    public void afterPushingXandY_thenWillPopYThenX() throws Exception {
        stack.push(42);
        stack.push(300);
        assertEquals(300, stack.pop());
        assertEquals(42, stack.pop());
    }
}
