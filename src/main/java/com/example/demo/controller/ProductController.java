package com.example.demo.controller;

import com.example.demo.exceptions.ProductNotFoundException;
import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

     @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) throws ProductNotFoundException {
//         if(id < 1 || id > 20){
//             return new ResponseEntity<>(HttpStatusCode.valueOf(400));
//         }

         System.out.println("Product ID "+id);
         Product product = productService.getProductById(id);
        return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
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
