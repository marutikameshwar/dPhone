package com.bajaj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.entity.ProductEntity;

public interface ProductDao extends JpaRepository<ProductEntity,Integer> {
    
}
