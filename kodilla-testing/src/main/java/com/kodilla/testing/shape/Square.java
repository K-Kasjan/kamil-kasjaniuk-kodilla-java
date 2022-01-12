package com.kodilla.testing.shape;

public class Square implements Shape{
    private int aLength;
    private String shapeName;

    public Square(int aLength, String shapeName) {
        this.aLength = aLength;
        this.shapeName = shapeName;
    }

    public int getALength() {
        return aLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "aLength=" + aLength +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (double) aLength*aLength;
    }
}
