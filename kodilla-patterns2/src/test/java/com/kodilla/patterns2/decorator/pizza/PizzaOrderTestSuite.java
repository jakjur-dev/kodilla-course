package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {


    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Order a basic pizza with cheese", description);
    }

    @Test
    public void testPizzaWithMeatOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(23), calculatedCost);
    }

    @Test
    public void testPizzaWithMeatOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Order a basic pizza with cheese and meat", description);
    }

    @Test
    public void testPizzaWithCheeseOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testPizzaWithCheeseOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Order a basic pizza with cheese + extra cheese", description);
    }

    @Test
    public void testPizzaWithDoubleCheeseOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testPizzaWithDoubleCheeseOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Order a basic pizza with cheese + extra cheese + extra cheese", description);
    }

    @Test
    public void testPizzaWithWithEverythingOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);
        theOrder = new TomatoDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(34), calculatedCost);
    }

    @Test
    public void testPizzaWithEverythingOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);
        theOrder = new TomatoDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Order a basic pizza with cheese and meat + extra cheese + jalapeno + fresh tomato", description);
    }
}