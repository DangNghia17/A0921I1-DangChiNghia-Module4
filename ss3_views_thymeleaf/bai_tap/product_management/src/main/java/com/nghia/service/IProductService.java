package com.nghia.service;

import com.nghia.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    void update(int id, Product customer);

    void remove(int id);

    Product findById(int id);

    List<Product> search(String name);
}
