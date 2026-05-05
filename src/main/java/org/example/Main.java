package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        Person person4 = new Person("Alice", 28, "Архітектор");

        // можемо змінити професію так:
        person4.setInfo(person4.name, person4.age,"Дизайнер");
        // або через окремий метод:
        person4.setProfession("Дизайнер");
        System.out.println("Після оновлення професії");
        System.out.println(person4.getInfo());
    }
}