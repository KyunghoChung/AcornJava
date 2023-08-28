package com.acorn.TeamProject.service;

import java.util.ArrayList;

import com.acorn.TeamProject.model.Product;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}