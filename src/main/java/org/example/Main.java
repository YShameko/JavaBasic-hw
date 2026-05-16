package org.example;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5.2);
        figures[1] = new Triangle(2.2, 7.1);
        figures[2] = new Square(5.2);
        for(Figure currentFigure: figures) {
            System.out.println("The area of a " + currentFigure.getClass().getSimpleName() +
                    " is " + currentFigure.calculateArea());
        }
    }

}