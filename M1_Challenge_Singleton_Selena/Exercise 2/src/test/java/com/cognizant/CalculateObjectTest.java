package com.cognizant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateObjectTest {
    CalculateObject calc;

    @Before
    public void setUp() throws Exception {
         calc = new CalculateObject();
    }

    @Test
    public void TestCalculatorObject() {
        assertEquals(2, calc.add(1, 1));
        assertEquals(5.6f, calc.add(3.3f, 2.3f), .01);
        assertEquals(75, calc.add(23,52));
        assertEquals(68, calc.multiply(34,2));
        assertEquals(4, calc.divide(12,3));
        assertEquals(1.71f, calc.divide(12.0f, 7.0f), .01);
        assertEquals(5.7f, calc.add(3.4f, 2.3f), .01);
        assertEquals(29.48f, calc.multiply(6.7f,4.4f),.01);
        assertEquals(5,calc.subtract(5.5f, 0.5f),.01);
        assertEquals(4.9f, calc.divide(10.8f, 2.2f),.01);


    }


}