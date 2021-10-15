package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{


    public static void main(String[] args) {

        System.out.print("Task for Java OOP");

        Calculator calculator = new Calculator();

        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(2, 5);
        figures[1] = new Circle(10);
        figures[2] = new Rectangle(1, 1);
        figures[3] = new Circle(1);


        System.out.printf("Sum of squares is %.3f", calculator.countSquareSum(figures));
    }
}