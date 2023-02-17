package com.bajaj.dao;

import com.bajaj.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersDao extends JpaRepository<OrdersEntity,Integer> {
}
