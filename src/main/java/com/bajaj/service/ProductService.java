package com.bajaj.service;

import java.util.ArrayList;
import java.util.List;

import com.bajaj.dao.ProductDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

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
            BeanUtils.copyProperties(p, bean);
            productBean.add(bean);
        }
        return productBean;
    }
    public List<ProductBean>productById(int productId)
    {
        List <ProductEntity> products= productDao.findById(productId);
        List<ProductBean> productBean=productBean=new ArrayList<>();
        for(ProductEntity p: products)
        {
            ProductBean bean=new ProductBean();
            BeanUtils.copyProperties(p,bean);
            productBean.add(bean);
        }
        return productBean;
    }
}
