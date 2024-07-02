package com.example.application;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductService {
    public String getProducts() {
        return "Listados de productos";
    }
}
