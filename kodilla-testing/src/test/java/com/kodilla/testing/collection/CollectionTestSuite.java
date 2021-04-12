package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;
import java.util.function.BooleanSupplier;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when exterminating odd numbers from empty list, " +
            "then exterminate() method should return empty list"
    )

    @Test
    void testOddNumbersExterminatorEmptyList  () {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        exterminator.exterminate(emptyList);
        System.out.println("Testing empty list: " + emptyList);

        Assertions.assertTrue(emptyList.isEmpty());
    }

    @DisplayName("when exterminating odd numbers from a list, " +
            "then exterminate() method should return the list without odd numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList () {

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("Testing list: " + numbers);

        exterminator.exterminate(numbers);
        System.out.println("List without odd numbers: " + numbers);

        Assertions.assertEquals(numbers, expectedResult);
    }


}
