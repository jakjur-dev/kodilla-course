package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        if (n >= 0 && n < figures.size()) {
            return figures.get(n);
        }
        return null;
    }

    public String showFigures(){
        String listString = "";
        for (Shape s : figures) {
            listString += s.getShapeName() + ", ";
        }
        return listString.substring(0, listString.length() - 2);
    }

    public int getFiguresQuantity(){
        return figures.size();
    }
}
