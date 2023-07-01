package com.unit;

import static org.junit.Assert.assertEquals;

//import org.junit.Test;
import com.javamethods.Adder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdderTest {

    @BeforeEach
    public void setUp() {
        System.out.println("SetUp method is calling");
    }

    @Test
    public void simpleTest() {
        System.out.println("verifying simpletest is called");
        Adder adder = new Adder();
        assertEquals("1 + 1 is 2", 2, adder.add(1, 1));
    }

    @Test
    public void orderTest() {
        System.out.println("verifying ordertest is called");
        Adder adder = new Adder();
        assertEquals("Order does not matter ", 5, adder.add(2, 3));
        assertEquals("Order does not matter ", 5, adder.add(3, 2));
    }



    @AfterEach
    public void tearDown() {
        System.out.println("tearDown method is calling");
    }


}
