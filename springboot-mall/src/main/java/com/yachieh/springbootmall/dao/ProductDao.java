package com.yachieh.springbootmall.dao;

import com.yachieh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
