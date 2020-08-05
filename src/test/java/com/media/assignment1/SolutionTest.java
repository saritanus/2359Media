package com.media.assignment1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Bird animal;

    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
        animal = new Bird();
    }

    @Test
    public void singTest() {
        animal.sing();
        Assert.assertEquals("I am singing.", outContent.toString().trim());
    }

    @After
    public void restore() {
        System.setOut(originalOut);

    }
}
