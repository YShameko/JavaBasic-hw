package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal total = new BigDecimal("12153.41");
        BigDecimal days = new BigDecimal("5");
        printResults(1, "smartphone", days, total);

        total = new BigDecimal("10486.85");
        days = new BigDecimal("7");
        printResults(2, "laptop", days, total);
    }

    private static BigDecimal calcDailySales(BigDecimal qtyDays, BigDecimal salesAmount) {
        return salesAmount.divide(qtyDays, 2, RoundingMode.HALF_UP);
    }

    private static void printResults (int productNo, String productName,
                                      BigDecimal days, BigDecimal total) {
        BigDecimal daily = calcDailySales(days, total);

        System.out.printf("Product No %d: %s,%n", productNo, productName);
        System.out.printf("total sales for %.0f days is EUR %.2f,%n", days, total);
        System.out.printf("sales by day is EUR %.2f.%n", daily);
    }
}