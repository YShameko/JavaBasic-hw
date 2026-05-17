package org.example;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(5.2),
                            new Triangle(2.2, 7.1),
                            new Square(5.2)
        };

        System.out.println("Total area of all these figures is: " + calculateAllAreas(figures));
    }

    public static double calculateAllAreas(Figure[] figures) {
        double sumAreas = 0;

        for(Figure currentFigure: figures) {
            sumAreas += currentFigure.calculateArea();
        }

        return sumAreas;
    }
}