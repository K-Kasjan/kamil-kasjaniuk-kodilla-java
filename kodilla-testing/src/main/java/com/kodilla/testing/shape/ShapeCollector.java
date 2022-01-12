package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public boolean addFigure(Shape shape){
        shapeList.add(shape);
        return true;
    }
    public boolean removeFigure(Shape shape){
        if(shapeList.contains((shape))){
            shapeList.remove(shape);
            return true;
        }
        return false;
    }
    public Shape getFigure(int n){
        if(n >= 0 && n < shapeList.size())
        {
            return shapeList.get(n);
        }
        return null;
    }
    public String showFigures(){
        return shapeList.toString();
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
}
