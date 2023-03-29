package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics="Welcome", groupId = "WelcomeGroup")
    public void listner(String receiveMessage){
        System.out.println("The message recived is " + receiveMessage);

    }
}
