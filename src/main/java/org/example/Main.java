package org.example;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d %n", i, i, sum);
        }

        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}