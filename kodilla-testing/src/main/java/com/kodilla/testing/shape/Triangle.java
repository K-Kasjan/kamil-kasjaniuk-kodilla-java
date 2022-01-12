package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private int aLength;
    private int hLength;
    private String shapeName;

    public Triangle(int aLength, int hLength, String shapeName) {
        this.aLength = aLength;
        this.hLength = hLength;
        this.shapeName = shapeName;
    }

    public int getALength() {
        return aLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aLength=" + aLength +
                ", hLength=" + hLength +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    public int getHLength() {
        return hLength;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (double) aLength*hLength/2;
    }
}
