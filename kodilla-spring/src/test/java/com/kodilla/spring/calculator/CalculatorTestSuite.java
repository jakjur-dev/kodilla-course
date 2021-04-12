package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        double add = calculator.add(2, 1);
        double sub = calculator.sub(2, 1);
        double mul = calculator.mul(2, 1);
        double div = calculator.div(2, 1);
        //Then
        assertEquals(add, 3);
        assertEquals(sub, 1);
        assertEquals(mul, 2);
        assertEquals(div, 2);
    }
}