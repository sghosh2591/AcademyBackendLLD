package com.example.demo.controller;

import com.example.demo.dto.CreateProductDto;
import com.example.demo.exceptions.ProductNotFoundException;
import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Qualifier("productService")
    @Autowired
    private ProductService productService;

     @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable UUID id) throws ProductNotFoundException {
//         if(id < 1 || id > 20){
//             return new ResponseEntity<>(HttpStatusCode.valueOf(400));
//         }
         System.out.println("Product ID "+id);
         Product product = productService.getProductById(id);
        return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
           List<Product> productList = productService.getAllProducts();
           if(productList == null || productList.isEmpty()){
               new ResponseEntity<>("No Products Found",HttpStatusCode.valueOf(404));
           }
        return new ResponseEntity<>(productList,HttpStatusCode.valueOf(200));
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody CreateProductDto createProductDto){
         if(createProductDto.getName() == null){
             return new ResponseEntity<>(HttpStatusCode.valueOf(400));
         }
        Product product = productService.createProduct(createProductDto);
        return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody CreateProductDto createProductDto,@PathVariable UUID id) throws ProductNotFoundException {
         Product product = productService.updateProduct(id,createProductDto);

         if(product == null){
             throw new ProductNotFoundException("Product not found");
         }

         return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable UUID id) throws ProductNotFoundException {
        boolean product = productService.deleteProduct(id);
            if(product){
                return new ResponseEntity<>("Product Deleted",HttpStatusCode.valueOf(200));
            }
        throw new ProductNotFoundException("No product with matching id to delete");

    }







//    @GetMapping("/show/{show_id}/seats/{show_seats}")
//    public ResponseEntity<String> bookShowSeats(@PathVariable int show_id, @PathVariable int show_seats){
//        System.out.println("Show ID "+show_id);
//        return ResponseEntity.ok("Your seats are booked "+show_seats);
//    }

}
