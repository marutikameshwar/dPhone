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

    public OrdersEntity(int orderId, int userId, int productId, String orderDate, int redeemedPoints, int salePrice, String orderStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.redeemedPoints = redeemedPoints;
        this.salePrice = salePrice;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getRedeemedPoints() {
        return redeemedPoints;
    }

    public void setRedeemedPoints(int redeemedPoints) {
        this.redeemedPoints = redeemedPoints;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", orderDate='" + orderDate + '\'' +
                ", redeemedPoints=" + redeemedPoints +
                ", salePrice=" + salePrice +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
