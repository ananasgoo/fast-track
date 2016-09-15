package com.example.subscriber;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by kyko on 9/15/2016.
 */
@Component
@Primary
public class MessagePrinter {

    public void printMessage(String source, String message) {
        System.out.println(source + " <" + message + ">");
    }
}