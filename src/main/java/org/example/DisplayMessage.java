package org.example;

public class DisplayMessage implements Printer {

    @Override
    public void print(Message message) {

        // Умова 3: Якщо обидва поля null
        if (message.text == null && message.sender == null) {
            Printer anonymousProcessor = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousProcessor.print(message);
            return;
        }

        // Умова 1: Якщо sender пустий або null
        if (message.sender == null || message.sender.isBlank()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.text);
        }
        // Умова 2: Якщо sender присутній
        else {
            System.out.println("Користувач " + message.sender + " відправив повідомлення: " + message.text);
        }
    }

    public static class Message {
        String text, sender;

        Message(String message, String sender) {
            this.text = message;
            this.sender = sender;
        }

        Message() {
            this(null, null);
        }

        Message(String message) {
            this(message, null);
        }

        void setText(String message) {
            this.text = message;
        }

        void setSender(String sender) {
            this.sender = sender;
        }

        String getText() {
            return this.text;
        }

        String getSender() {
            return this.sender;
        }
    }
}
