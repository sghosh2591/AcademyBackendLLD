package com.example.demo.services;

import com.example.demo.dto.CreateProductDto;
import com.example.demo.exceptions.ProductNotFoundException;
import com.example.demo.models.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    public Product getProductById(UUID id) throws ProductNotFoundException;

    public Product createProduct(CreateProductDto productDto);

    public List<Product> getAllProducts();

    public Product updateProduct(UUID id, CreateProductDto productDto);

    public boolean deleteProduct(UUID id);

}
