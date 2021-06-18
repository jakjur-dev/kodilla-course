package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseDecorator extends AbstractPizzaOrderDecorator {
    public CheeseDecorator(PizzaOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra cheese";
    }
}