package org.example;

public class Main {
    public static void main(String[] args) {
        Printer msg = new DisplayMessage();

        msg.print(null, null);

        msg.print("Привіт усім!", "");

        msg.print("Все працює!", "Yuriy");
    }

}