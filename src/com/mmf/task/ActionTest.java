package com.mmf.task;

import com.epam.task1.Action;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class ActionTest {
    Action action;

    @BeforeClass
    public void setUp() {
        action = new Action();
    }

    @Test()
    public void testSum() {
        int actual = action.sum(2, 3);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test()
    public void testMultiply() {
        int actual = action.multiply(2, 3);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test()
    public void testDiv() {
        int actual = action.div(2, 3);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @AfterClass
    public void tearDown() {
    }
}