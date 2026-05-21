package org.example;

public class DisplayMessage implements Printer {

    @Override
    public void print(String messageText, String senderName) {

        // Умова 3: Якщо обидва поля null
        if (messageText == null && senderName == null) {
            Printer anonymousProcessor = new Printer() {
                @Override
                public void print(String message, String sender) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousProcessor.print(messageText, senderName);
            return;
        }

        // Умова 1: Якщо sender пустий або null
        if (senderName == null || senderName.isBlank()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + messageText);
        }
        // Умова 2: Якщо sender присутній
        else {
            System.out.println("Користувач " + senderName + " відправив повідомлення: " + messageText);
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
