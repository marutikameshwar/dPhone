package com.bajaj.controller;

import com.bajaj.beans.OrdersBean;
import com.bajaj.beans.ProductBean;
import com.bajaj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    public OrderService orderService;
    @PostMapping("/add")
    public ResponseEntity<String> newOrder(@RequestBody OrdersBean orderBean) {
        return orderService.newOrder(orderBean);
    }
    @GetMapping("/displayall")
    public ResponseEntity<Map<OrdersBean, ProductBean>> allOrders()
    {
        return orderService.allOrders();
    }


}
