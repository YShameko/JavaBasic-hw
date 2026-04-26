package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        int index;

        initArray(myArray);
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(myArray));

        insertionSort(myArray);
        System.out.println("Відсортований масив:      " + Arrays.toString(myArray));

        Scanner userInput = new Scanner(System.in);
        System.out.println("Введіть число для пошуку: ");
        int numberToFind = userInput.nextInt();
        index = binarySearch(myArray, numberToFind);
        if (index >= 0) {
            System.out.printf("Індекс числа %d у відсортованому масиві: %d%n", numberToFind, index);
        }
        else {
            System.out.printf("Число %d у масиві не знайдено %n", numberToFind);
        }
    }

    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }
    }
    //------------------------------------------------------------------------------------
    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int value, int low, int high) {
        int index = -1; // повертаємо -1, якщо не знайшли value серед елементів масиву
        int middle;

        if (low <= high) {
            middle = low + (high - low) / 2;
            if (array[middle] == value) {
                index = middle;
            } else if (array.length > 1) {
                if (array[middle] > value) {
                    index = binarySearch(array, value, low, high - 1);
                } else {
                    index = binarySearch(array, value, middle + 1, high);
                }
            }
        }
        return index;
    }
    //------------------------------------------------------------------------------------
    public static void insertionSort(int[] array) {
        int currentElement;

        for (int i = 1; i < array.length; i++) {
            currentElement = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (currentElement < array[j]) {
                    array[j + 1] = array[j];
                    array[j] = currentElement;
                }
                else {
                    break;
                }
            }
        }
    }
}