package org.example;

interface Figure {
    double calculateArea();
}

class Circle implements Figure {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

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

class Triangle implements Figure {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}