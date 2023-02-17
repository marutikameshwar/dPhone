package com.bajaj.service;

import com.bajaj.beans.OrdersBean;
import com.bajaj.beans.ProductBean;
import com.bajaj.dao.OrdersDao;
import com.bajaj.dao.ProductDao;
import com.bajaj.entity.OrdersEntity;
import com.bajaj.entity.ProductEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    @Autowired
    public OrdersDao ordersDao;
    @Autowired
    public ProductDao productDao;
    public ResponseEntity<String> newOrder(OrdersBean ordersBean)
    {
       try {
            OrdersEntity ordersEntity = new OrdersEntity();
            BeanUtils.copyProperties(ordersBean, ordersEntity);
            ordersDao.save(ordersEntity);
            return new  ResponseEntity<String>("order executed Successfully",HttpStatus.OK);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return new ResponseEntity<String>("order failed",HttpStatus.OK);

        }
    }
    public ResponseEntity<Map<OrdersBean, ProductBean>> allOrders()
    {
        Map<OrdersBean, ProductBean> orderProduct=new HashMap<>();
        List<OrdersEntity> orders=ordersDao.findByUserId(7); ///here we have to add the id of the user who is logged in
        for (OrdersEntity o: orders)
        {
            ProductEntity product= productDao.findByProductId(o.getProductId());
            OrdersBean ordersBean=new OrdersBean();
            ProductBean productBean=new ProductBean();
            BeanUtils.copyProperties(o,ordersBean);
            BeanUtils.copyProperties(product,productBean);
            orderProduct.put(ordersBean,productBean);
        }
        return  new ResponseEntity<Map<OrdersBean, ProductBean>>(orderProduct,HttpStatus.OK);
    }
}
