package com.bajaj.service;

import java.util.ArrayList;
import java.util.List;

import com.bajaj.dao.ProductDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.bajaj.beans.ProductBean;
import com.bajaj.entity.ProductEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    public ProductDao productDao;
    public List<ProductBean>allProducts()
    {
        List <ProductEntity> products=productDao.findAll();
        List <ProductBean> productBean=new ArrayList<>();
        for( ProductEntity p: products)
        {
            ProductBean bean=new ProductBean();
            BeanUtils.copyProperties(products, bean);
            productBean.add(bean);
        }
        return productBean;


    }
}
