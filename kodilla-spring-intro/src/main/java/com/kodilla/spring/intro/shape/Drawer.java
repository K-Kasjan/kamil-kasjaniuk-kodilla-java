package com.kodilla.spring.intro.shape;

public class Drawer {

    public void doDrawing() {
        Figure circle = new Circle();
        Figure triangle = new Triangle();

        circle.draw();
        triangle.draw();
    }
}