package org.example;

public class Car {
    public Car() {}

    public void start() {
        System.out.println("Please wait. Checking und starting subsystems:");
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity has been started successfully");
    }
    private void startCommand() {
        System.out.println("Command has been started successfully");
    }
    private void startFuelSystem() {
        System.out.println("Fuel system has been started successfully");
    }
}
