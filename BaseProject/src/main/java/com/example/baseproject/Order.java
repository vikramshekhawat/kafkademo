package com.example.baseproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
public class Order {
    private String orderId;
    private String orderName;
    private int quantity;
    private double price;

}
