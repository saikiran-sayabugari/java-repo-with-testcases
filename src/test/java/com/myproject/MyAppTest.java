package com.myproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyAppTest {

    @Test
    public void testAdd() {
        assertEquals(5, MyApp.add(2, 3));
    }

    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(MyApp.isEven(4));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(MyApp.isEven(5));
    }

    @Test
    public void testGreet() {
        assertEquals("Hello, John!", MyApp.greet("John"));
    }

    @Test(expected = NullPointerException.class)
    public void testGreetWithNull() {
        MyApp.greet(null);
    }

    @Test
    public void testCalculateCircleArea() {
        assertEquals(314.1592653589793, MyApp.calculateCircleArea(10), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateCircleAreaWithNegativeRadius() {
        MyApp.calculateCircleArea(-1);
    }

    @Test
    public void testReverseString() {
        assertEquals("cba", MyApp.reverseString("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseStringWithNull() {
        MyApp.reverseString(null);
    }


    // Additional test cases can be added here as needed
}

