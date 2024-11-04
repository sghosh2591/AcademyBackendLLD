package com.example.demo.services;

import com.example.demo.dto.CreateProductDto;
import com.example.demo.exceptions.ProductNotFoundException;
import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("productService")
public class ProductServiceImpl implements ProductService{

     @Autowired
    ProductRepository productRepository;


    @Override
    public Product getProductById(UUID id) throws ProductNotFoundException {
       Product product = productRepository.findProductById(id);
       if (product == null) {
           throw new ProductNotFoundException("Product not found");
       }
        return product;
    }

    @Override
    public Product createProduct(CreateProductDto productDto) {
        Product p = productRepository.findFirstByNameAndCategory(productDto.getName(), productDto.getCategory());
        if (p != null) {
            return p;
        }
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setCategory(productDto.getCategory());
        product = productRepository.save(product);
        product.setId(product.getId());
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(UUID id,CreateProductDto productDto) {
        Product product = productRepository.findProductById(id);
        if (product == null) {
            return null;
        }
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setCategory(productDto.getCategory());
        productRepository.save(product);
        return product;
    }

    @Override
    public boolean deleteProduct(UUID id) {
        System.out.println("DELETE PRODUCT ID "+id);
        int xx =  productRepository.deleteProductById(id);
        System.out.println("DELETE PRODUCT "+xx);
        return xx > 0;
    }


}
