package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int userNumber = userInput.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %d %n%n", userNumber, calculateSquare(userNumber));

        System.out.print("Введіть радіус циліндра: ");
        double radius = userInput.nextDouble();
        System.out.print("та його висоту: ");
        double height = userInput.nextDouble();
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %.2f %n%n",
                radius, height, calculateCylinderVolume(radius, height));

        System.out.print("Скільки чисел буде у масиві? ");
        int n = userInput.nextInt();
        int[] array = new int[n];
        initArray(array);
        System.out.println("Масив чисел: " + Arrays.toString(array));
        System.out.printf("Сума всіх елементів масиву дорівнює %d %n%n", sumArray(array));

        userInput.nextLine(); // Очищуємо "хвіст" після попереднього вводу
        System.out.print("Введіть рядок: ");
        String userString = userInput.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reverseString(userString));
        System.out.println();


        System.out.print("Введіть a: ");
        int userA = userInput.nextInt();
        System.out.print("Введіть b: ");
        int userB = userInput.nextInt();
        System.out.printf("Результат %d^%d дорівнює %d %n%n", userA, userB, aPowerB(userA, userB));

        System.out.print("Введіть ціле число n: ");
        n = userInput.nextInt();
        userInput.nextLine(); // Очищуємо "хвіст" після попереднього вводу
        System.out.print("Введіть текстовий рядок: ");
        userString = userInput.nextLine();
        repeatThisLine(n, userString);
    }
    //------------------------------------------------------------------------------------
    public static int calculateSquare(int value) {
        return value * value;
    }

    //------------------------------------------------------------------------------------
    public static double calculateCylinderVolume(double radius, double height) {
        double pi = 3.14159;
        return pi * radius * radius * height;
    }

    //------------------------------------------------------------------------------------
    public static void initArray(int[] array) {
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введіть %d-е число: ", i + 1);
            array[i] = userInput.nextInt();
        }
    }

    //------------------------------------------------------------------------------------
    public static int sumArray(int[] array) {
        int sum = 0;

        for (int currentValue : array) {
            sum += currentValue;
        }
        return sum;
    }

    //------------------------------------------------------------------------------------
    public static String reverseString(String text) {
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    //------------------------------------------------------------------------------------
    public static long aPowerB(int a, int b) {
        long result = a;

        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    //------------------------------------------------------------------------------------
    public static void repeatThisLine(int n, String text) {
        for (int i = 1; i <= n; i++) {
            System.out.println(text);
        }
    }
    //------------------------------------------------------------------------------------
}