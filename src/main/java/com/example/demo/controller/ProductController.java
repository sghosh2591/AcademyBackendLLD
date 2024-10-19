package com.example.demo.controller;

import com.example.demo.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

     @GetMapping("/{product_id}")
    public ResponseEntity<String> getProductById(@PathVariable int product_id){
        System.out.println("Product ID "+product_id);
        return ResponseEntity.ok("Product ID: "+product_id);
    }

    @GetMapping("/product")
    public ResponseEntity<String> getProduct(){
        System.out.println("Product ");
        return ResponseEntity.ok("Show all Products");
    }

    @GetMapping("/show/{show_id}/seats/{show_seats}")
    public ResponseEntity<String> bookShowSeats(@PathVariable int show_id, @PathVariable int show_seats){
        System.out.println("Show ID "+show_id);
        return ResponseEntity.ok("Your seats are booked "+show_seats);
    }

}
