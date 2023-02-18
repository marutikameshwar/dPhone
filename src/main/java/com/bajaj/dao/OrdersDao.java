package com.bajaj.dao;


import com.bajaj.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersDao extends JpaRepository<OrdersEntity,Integer> {

    @Query("Select u from OrdersEntity u where u.userId = :Id")
    public List<OrdersEntity> findByUserId(int Id);
}
