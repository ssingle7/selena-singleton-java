package com.cognizant;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterIfTest {

    @Test
    public void shouldConvertNumberToCorrespondingMonth() {
        Converter converterIf = new ConverterIf();
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("February", converterIf.convertMonth(2));
        assertEquals("March", converterIf.convertMonth(3));
        assertEquals("April", converterIf.convertMonth(4));
        assertEquals("May", converterIf.convertMonth(5));
        assertEquals("June", converterIf.convertMonth(6));
        assertEquals("July", converterIf.convertMonth(7));
        assertEquals("August", converterIf.convertMonth(8));
        assertEquals("September", converterIf.convertMonth(9));
        assertEquals("October", converterIf.convertMonth(10));
        assertEquals("November", converterIf.convertMonth(11));
        assertEquals("December", converterIf.convertMonth(12));
    }

    @Test
    public void shouldConvertNumberToCorrespondingDay() {
        Converter converterIf = new ConverterIf();
        assertEquals("Sunday", converterIf.convertDay(1));
        assertEquals("Monday", converterIf.convertDay(2));
        assertEquals("Tuesday", converterIf.convertDay(3));
        assertEquals("Wednesday", converterIf.convertDay(4));
        assertEquals("Thursday", converterIf.convertDay(5));
        assertEquals("Friday", converterIf.convertDay(6));
        assertEquals("Saturday", converterIf.convertDay(7));

    }
}