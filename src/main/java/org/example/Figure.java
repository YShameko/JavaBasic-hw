package org.example;

public abstract class Figure {
    double size1;
    double size2;

    public Figure(double size1, double size2) {
        this.size1 = size1;
        this.size2 = size2;
    }

    public Figure(double size1) {
        this.size1 = size1;
    }

    public abstract double calculateArea();
}
