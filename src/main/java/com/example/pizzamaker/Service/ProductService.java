package com.example.pizzamaker.Service;

import com.example.pizzamaker.model.Product;

import java.util.List;

public interface ProductService {
    Product readByProductType(int productTypeId);

    Product read(int id);

    List<Product> readAll();

    void create(Product Product);

    Product update(int id, Product Product);

    void delete(int id);
}
