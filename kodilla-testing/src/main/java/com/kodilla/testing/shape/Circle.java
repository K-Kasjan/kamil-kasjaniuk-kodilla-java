package com.kodilla.testing.shape;

public class Circle implements Shape{
    private int rLength;
    private String shapeName;

    public Circle(int rLength, String shapeName) {
        this.rLength = rLength;
        this.shapeName = shapeName;
    }

    public int getRLength() {
        return rLength;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rLength=" + rLength +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField(){
        return (double) (22*rLength*rLength)/7;
    }
}
