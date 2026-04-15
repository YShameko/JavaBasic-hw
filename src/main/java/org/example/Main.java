package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("When your income is 19 000, the tax will be " + calcIncomeTax(19000));
    }

    public static float calcIncomeTax (float income) {
        float tax = 0.00f;
        if (income >= 0 && income <= 10000) {
            tax = income * 0.025f;
        } else if (income > 10000 && income <= 25000) {
            tax = income * 0.043f;
        } else {
            tax = income * 0.067f;
        }

        return tax;
    }

}
