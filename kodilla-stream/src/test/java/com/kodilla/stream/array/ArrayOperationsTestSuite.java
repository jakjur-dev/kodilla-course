package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){

        //Given
        ArrayAverage arrayAverage = new ArrayAverage();
        int[] numbers = new int[]{17, 42, 24, 18, 96, 72, 16, 78, 35, 12, 11, 56, 80, 13, 94, 54, 13, 45, 46, 21};

        //When
        double expectedResult = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(42.15, expectedResult);
    }
}
