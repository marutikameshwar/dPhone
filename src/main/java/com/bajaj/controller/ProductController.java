package com.bajaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.beans.ProductBean;
import com.bajaj.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	public ProductService productService;
	@GetMapping("/allproducts")
	public ResponseEntity<List<ProductBean>> allProducts()
	{
		List<ProductBean> products=productService.allProducts();
		return new ResponseEntity<List<ProductBean>>(products,HttpStatus.OK);
	}

}
