package com.example.demo.repositories;

import com.example.demo.models.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product,UUID> {

     Product findFirstByNameAndCategory(String name,String category);

     Product findProductById(UUID id);

     @Transactional
     int deleteProductById(UUID id);
}
