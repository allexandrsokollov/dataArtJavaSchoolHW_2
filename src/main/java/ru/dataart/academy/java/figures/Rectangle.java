package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double findPerimeter() {
        return height + height + width + width;
    }

    @Override
    public double findSquare() {
        return height * width;
    }
}
