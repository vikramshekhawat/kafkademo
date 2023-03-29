package com.example.kafkademo.controller;

import com.example.kafkademo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("rest/api")
public class RestController {
    @Autowired
    Producer producer;
    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("msg")  String message){
        producer.sendMessageToTopic(message);


    }
}
