package com.bajaj.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersBean {
    private int orderId;
    private int userId;
    private int productId;
    private Date orderDate;
    private int redeemedPoints;
    private int salePrice;
    private String orderStatus;
}
