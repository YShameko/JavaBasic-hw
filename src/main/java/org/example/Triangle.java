package org.example;

public class Triangle extends Figure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return size1 * size2 / 2;
    }
}
