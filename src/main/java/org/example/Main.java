package org.example;

public class Main {
    public static void main(String[] args) {
        Day todayIs = Day.THURSDAY;
        TipOfTheDay myAdvise = new TipOfTheDay();

        myAdvise.advise(todayIs);
    }
}