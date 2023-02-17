package com.bajaj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name="orders")
public class OrdersEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "mobile_id")
    private int productId;
    @Column(name="order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Column(name = "redeemed_points")
    private int redeemedPoints;
    @Column(name = "sale_price")
    private int salePrice;
    @Column(name = "order_status")
    private String orderStatus;
}
