package com.bajaj.service;

import com.bajaj.beans.OrdersBean;
import com.bajaj.dao.OrdersDao;
import com.bajaj.entity.OrdersEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    public OrdersDao ordersDao;
    public ResponseEntity<String> newOrder(OrdersBean ordersBean)
    {
     //   try {
            OrdersEntity ordersEntity = new OrdersEntity();
            BeanUtils.copyProperties(ordersBean, ordersEntity);
            ordersDao.save(ordersEntity);
            return new  ResponseEntity<String>("order executed Successfully",HttpStatus.OK);
      //  }
//        catch (Exception e)
//        {
//            System.out.println(e);
//            return new ResponseEntity<String>("order failed",HttpStatus.OK);
//
//        }
    }
}
