package com.bajaj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrdersEntity {
    @Id
    @Column(name = "id")
    private int orderId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "mobile_id")
    private int productId;
    @Column(name="order_date")
    private String orderDate;
    @Column(name = "redemmed_points")
    private int redeemedPoints;
    @Column(name = "sale_price")
    private int salePrice;
    @Column(name = "order_status")
    private String orderStatus;
    public OrdersEntity() {
    }
   
}
