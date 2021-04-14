package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String shapeClass) {
        switch (shapeClass) {
            case DRIVING:
                return new DrivingTask("VAN transport", "Wroclaw, Pl. Powstancow Slaskich 13/4", "Ford Transit");
            case PAINTING:
                return new PaintingTask("Painting red wall", "red", "wall");
            case SHOPPING:
                return new ShoppingTask("Buy three apples", "apples", 3);
            default:
                return null;
        }

    }
}
