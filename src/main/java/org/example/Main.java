package org.example;

public class Main {
    public static void main(String[] args) {

        Employee person1 = new Employee("John", "Інженер", "123@test.com",
                "380(50) 111-22-33", 30);
        Employee person2 = new Employee();
        System.out.println(person1);
        System.out.println(person2);

        Car testCar = new Car();
        testCar.start();
    }

}