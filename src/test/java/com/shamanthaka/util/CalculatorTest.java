package com.shamanthaka.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }


    @Test
    public void addTest(){

        int sum = calculator.add(5,9);
        assertEquals(14,sum);
    }

    @Test
    public void divisionTest(){

        int division = calculator.division(5,2);

        assertEquals(2,division);

    }
}
