package com.example.kafkaproducer.controller;

import com.example.baseproject.Order;
import com.example.baseproject.OrderEvent;
import com.example.kafkaproducer.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class KafkaProdController {

    private OrderService orderService;

    public KafkaProdController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/orders")
    public String createOrder(@RequestBody Order order) {
        order.setOrderId(UUID.randomUUID().toString());
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setStatus("Pending");
        orderEvent.setMessage("Order status is pending");
        orderEvent.setOrder(order);
        orderService.sendMessage(orderEvent);
        return "Order placed successfully";

    }


}
