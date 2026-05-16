package org.example;

public class Square extends Figure {
    public Square(double size) {
        super(size);
    }

    @Override
    public double calculateArea() {
        return size1 * size1;
    }
}
