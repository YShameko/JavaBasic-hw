package org.example;

public class Main {
    public static void main(String[] args) {
        Printer printer = new DisplayMessage();

        printer.print(new DisplayMessage.Message(null, null));
        printer.print(new DisplayMessage.Message("Привіт усім!", ""));
        printer.print(new DisplayMessage.Message("Все працює!", "Yuriy"));
    }

}