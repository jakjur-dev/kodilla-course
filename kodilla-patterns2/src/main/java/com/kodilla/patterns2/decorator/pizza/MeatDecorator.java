package com.kodilla.patterns2.decorator.pizza;
import java.math.BigDecimal;

public class MeatDecorator extends AbstractPizzaOrderDecorator {
    public MeatDecorator(PizzaOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and meat";
    }
}
