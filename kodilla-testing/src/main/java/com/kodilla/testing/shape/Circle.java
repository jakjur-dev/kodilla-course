package com.kodilla.testing.shape;


public class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getField() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}
