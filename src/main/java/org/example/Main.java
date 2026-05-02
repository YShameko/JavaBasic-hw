package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = new int[4][4];

        initArray(myArray);
        displayArray(myArray);
        sumEvenRows(myArray);
        sumOddRows(myArray);
        productEvenColumns(myArray);
        productOddColumns(myArray);
        if (isThisMatrixMagic(myArray)) {
            System.out.println("Ця матриця є магічним квадратом. Пощастило ж тобі!");
        }
        else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
    //------------------------------------------------------------------------------------
    public static void initArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50) + 1;
            }
        }
    }

    //------------------------------------------------------------------------------------
    public static void displayArray(int[][] array) {
        System.out.println("Матриця " + array.length + "х" + array.length);
        for (int[] row: array) {
            for (int value: row) {
                System.out.printf("%2s ", value);
            }
            System.out.println();
        }
    }

    //------------------------------------------------------------------------------------
    public static void sumEvenRows(int[][] array) {
        int sum = 0;
        String message;

        message = "Сума елементів у парних рядках (рядок ";
        for (int i = 0; i < array.length; i += 2) {
                message += i + ", ";
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
        }
        message = message.substring(0, message.length() - 2) + "): " + sum;
        System.out.println(message);
    }

    //------------------------------------------------------------------------------------
    public static void sumOddRows(int[][] array) {
        int sum = 0;
        String message;

        message = "Сума елементів у непарних рядках (рядок ";
        for (int i = 1; i < array.length; i += 2) {
                message += i + ", ";
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
        }
        message = message.substring(0, message.length() - 2) + "): " + sum;
        System.out.println(message);
    }

    //------------------------------------------------------------------------------------
    public static void productEvenColumns(int[][] array) {
        long product = 1;
        String message;

        message = "Добуток елементів у парних стовпцях (стовпець ";
        for (int j = 0; j < array[0].length; j += 2) {
            for (int i = 0; i < array.length; i++) {
                    product *= array[i][j];
            }
            message += j + ", ";
        }
        message = message.substring(0, message.length() - 2) + "): " + product;
        System.out.println(message);
    }

    //------------------------------------------------------------------------------------
    public static void productOddColumns(int[][] array) {
        long product = 1;
        String message;

        message = "Добуток елементів у непарних стовпцях (стовпець ";
        for (int j = 1; j < array[0].length; j += 2) {
            for (int i = 0; i < array.length; i++) {
                product *= array[i][j];
            }
            message += j + ", ";
        }
        message = message.substring(0, message.length() - 2) + "): " + product;
        System.out.println(message);
    }

    //------------------------------------------------------------------------------------
    public static boolean isThisMatrixMagic(int[][] array) {
        int magicSum = 0;
        int currentSum;

        if (array.length == 0 || array.length != array[0].length) {
            return false; // якщо матриця нульових розмірів або не квадратна
        }

        for (int value: array[0]) {
                magicSum += value;
        }
        // для рядків
        for (int i = 1; i < array.length; i ++) {
            currentSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                currentSum += array[i][j];
            }
            if (currentSum != magicSum) {
                return false;
            }
        }
        // для стовпців
        for (int j = 0; j < array[0].length; j ++) {
            currentSum = 0;
            for (int i = 0; i < array.length; i++) {
                currentSum += array[i][j];
            }
            if (currentSum != magicSum) {
                return false;
            }
        }
        // тепер діагоналі
        currentSum = 0;
        for (int i = 0; i < array.length; i ++) {
            currentSum += array[i][i];
        }
        if (currentSum != magicSum) {
            return false;
        }

        currentSum = 0;
        for (int i = 0; i < array.length; i ++) {
            currentSum += array[i][array.length - 1 - i];
        }
        if (currentSum != magicSum) {
            return false;
        }

        return true;
    }
    //------------------------------------------------------------------------------------
}