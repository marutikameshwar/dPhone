package com.bajaj.controller;

import com.bajaj.beans.OrdersBean;
import com.bajaj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    public OrderService orderService;
    @PostMapping("/add")
    public ResponseEntity<String> newOrder(@RequestBody OrdersBean orderBean) {
        return orderService.newOrder(orderBean);
    }
}
