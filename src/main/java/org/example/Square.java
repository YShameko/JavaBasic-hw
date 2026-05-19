package org.example;

class Square implements Figure {
    double size;

    Square(double size) {
        this.size = size;
    }

    @Override
    public double calculateArea() {
        return size * size;
    }
}
