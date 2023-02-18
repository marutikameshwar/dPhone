package com.bajaj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<ProductEntity,Integer> {
    List findById(int productId);

    @Query("Select product from ProductEntity product where product.id=:productId")
    public ProductEntity findByProductId(int productId);
}
