package com.bajaj.beans;

public class OrdersBean {
    private int orderId;
    private int userId;
    private int productId;
    private int orderDate;
    private String referalUsed;
    private int redeemedPoints;
    private int salePrice;
    public OrdersBean() {
    }
    public OrdersBean(int orderId, int userId, int productId, int orderDate, String referalUsed, int redeemedPoints,
            int salePrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.referalUsed = referalUsed;
        this.redeemedPoints = redeemedPoints;
        this.salePrice = salePrice;
    }
    @Override
    public String toString() {
        return "OrdersBean [orderId=" + orderId + ", userId=" + userId + ", productId=" + productId + ", orderDate="
                + orderDate + ", referalUsed=" + referalUsed + ", redeemedPoints=" + redeemedPoints + ", salePrice="
                + salePrice + "]";
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
    public int getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }
    public String getReferalUsed() {
        return referalUsed;
    }
    public void setReferalUsed(String referalUsed) {
        this.referalUsed = referalUsed;
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
    
}
