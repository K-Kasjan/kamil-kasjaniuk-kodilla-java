package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
        User user = null;
        Optional<User> optionalUser = Optional.ofNullable(user);
        MessageSender messageSender = new MessageSender();
        optionalUser.ifPresent(u -> {
            try {
                messageSender.sendMessageTo(u, "Hello");
            } catch (MessageNotSentException e) {
                System.out.println("Message is not send," +
                        "but my program still running very well!");
            }
        });

        System.out.println("Processing other logic!");

    }
}