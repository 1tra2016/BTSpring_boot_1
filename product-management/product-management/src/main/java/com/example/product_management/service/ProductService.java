package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products =  new ArrayList<>();
    public ProductService() {
        products.add(new Product(1, "Laptop", 1500));
        products.add(new Product(2, "Chuột", 20));
        products.add(new Product(3, "Bàn phím", 45));
    }
}
