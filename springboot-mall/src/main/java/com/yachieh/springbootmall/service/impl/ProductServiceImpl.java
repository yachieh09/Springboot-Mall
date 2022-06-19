package com.yachieh.springbootmall.service.impl;

import com.yachieh.springbootmall.dao.ProductDao;
import com.yachieh.springbootmall.model.Product;
import com.yachieh.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
