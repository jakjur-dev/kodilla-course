package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding and removing figures")
    class TestAddRemove {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Square(2));
            shapeCollector.addFigure(new Triangle(2, 4));
            //Then
            Assertions.assertEquals(3, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testRemoveFigure() {
            //Given
            Circle circle = new Circle(2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(new Square(2));
            shapeCollector.addFigure(new Triangle(2, 4));
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(2, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests for figures retrieval")
    class TestFigures {
        @Test
        void testGetFigure() {
            //Given
            Circle circle = new Circle(2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, retrievedFigure);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Square(2));
            shapeCollector.addFigure(new Triangle(2, 4));
            //When
            String figuresString;
            figuresString = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(figuresString, "Circle, Square, Triangle");
        }
    }
}