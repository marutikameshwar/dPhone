package com.bajaj.beans;

public class ProductBean {
    private int productId;
    private String productModel;
    private String productBrand;
    private int productPrice;
    private String productDescription;
    private String productImageUrl;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductModel() {
        return productModel;
    }
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }
    public String getProductBrand() {
        return productBrand;
    }
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getProductImageUrl() {
        return productImageUrl;
    }
    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }
    @Override
    public String toString() {
        return "ProductBean [productId=" + productId + ", productModel=" + productModel + ", productBrand="
                + productBrand + ", productPrice=" + productPrice + ", productDescription=" + productDescription
                + ", productImageUrl=" + productImageUrl + "]";
    }
    public ProductBean(int productId, String productModel, String productBrand, int productPrice,
            String productDescription, String productImageUrl) {
        this.productId = productId;
        this.productModel = productModel;
        this.productBrand = productBrand;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productImageUrl = productImageUrl;
    }
    public ProductBean() {
    }
    
}
