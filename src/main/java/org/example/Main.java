package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        double average;

        initArray(myArray);
        System.out.println("Елементи масиву: " + Arrays.toString(myArray));
        System.out.println("Сума від'ємних чисел: " + sumNegatives(myArray));
        System.out.println("Кількість парних чисел: " + qtyEvens(myArray));
        System.out.println("Кількість непарних чисел: " + qtyOdds(myArray));

        int[] findResult = findMin(myArray);
        System.out.println("Найменший елемент: " + findResult[0] + " (з індексом " + findResult[1] +")");

        findResult = findMax(myArray);
        System.out.println("Найбільший елемент: " + findResult[0] + " (з індексом " + findResult[1] +")");

        average = calcAverage(myArray);
        if (Double.isNaN(average)) {
            System.out.println("У масиві немає від'ємних чисел.");
        }
        else {
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + average);
        }

    }

    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 201) - 100;
        }
    }

    public static int sumNegatives(int[] array) {
        int sum = 0;

        for(int el: array) {
            if (el < 0) {
                sum += el;
            }
        }

        return sum;
    }

    public static int qtyEvens(int[] array) {
        int qty = 0;

        for(int el: array) {
            if (el % 2 == 0) {
                qty++;
            }
        }

        return qty;
    }

    public static int qtyOdds(int[] array) {
        int qty = 0;

        for(int el: array) {
            if (el % 2 != 0) {
                qty++;
            }
        }

        return qty;
    }

    public static int[] findMin(int[] array) {
        int min = 0;
        int[] result = new int[2]; // 1st element is value, 2nd is its index

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                result[0] = min = array[i];
                result[1] = i;
            }
        }

        return result;
    }

    public static int[] findMax(int[] array) {
        int max = 0;
        int[] result = new int[2]; // 1st element is value, 2nd is its index

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                result[0] = max = array[i];
                result[1] = i;
            }
        }

        return result;
    }

    public static double calcAverage(int[] array) {
        int sum = 0;
        int[] newArray = {};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray = Arrays.copyOfRange(array, i + 1, array.length);
                break;
            }
        }
        for(int el: newArray) {
            sum += el;
        }

        if (newArray.length > 0) {
            return Math.round((double) sum / newArray.length * 100.0) / 100.0;
        }
        else {
            return Double.NaN;
        }
    }
}