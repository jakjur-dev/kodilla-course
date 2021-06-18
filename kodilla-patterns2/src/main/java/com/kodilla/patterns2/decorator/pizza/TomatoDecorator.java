package com.kodilla.patterns2.decorator.pizza;
import java.math.BigDecimal;

public class TomatoDecorator extends AbstractPizzaOrderDecorator {
    public TomatoDecorator(PizzaOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + fresh tomato";
    }
}
