package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    public double countSquareSum(Figure[] figures) {

        double sum = 0;

        for(Figure figure: figures) {
            sum += figure.findSquare();
        }

        return sum;
    }
}
