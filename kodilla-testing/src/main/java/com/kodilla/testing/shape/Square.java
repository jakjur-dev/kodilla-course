package com.kodilla.testing.shape;

public class Square implements Shape {

    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getField() {
        return Math.pow(a, 2);
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}
