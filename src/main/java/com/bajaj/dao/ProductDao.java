package com.bajaj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.entity.ProductEntity;

import java.util.List;

public interface ProductDao extends JpaRepository<ProductEntity,Integer> {
    List findById(int productId);
}
