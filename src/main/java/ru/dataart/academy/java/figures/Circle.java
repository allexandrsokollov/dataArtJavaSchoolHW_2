package ru.dataart.academy.java.figures;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double findSquare() {
        return Math.PI * radius * radius;
    }
}
