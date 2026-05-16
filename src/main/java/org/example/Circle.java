package org.example;

public class Circle extends Figure {
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double calculateArea() {
        return 3.14159 * size1 * size1;
    }
}
