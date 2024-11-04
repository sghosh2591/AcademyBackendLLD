package com.example.demo.services;

import com.example.demo.dto.CreateProductDto;
import com.example.demo.dto.FakeStoreProductDto;
import com.example.demo.exceptions.ProductNotFoundException;
import com.example.demo.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service("fakestore")
public class FakeStoreProductService implements ProductService{

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(UUID id, CreateProductDto productDto) {
        return null;
    }

    @Override
    public boolean deleteProduct(UUID id) {
      return false;
    }

    @Override
    public Product getProductById(UUID id) throws ProductNotFoundException{
      //https://fakestoreapi.com/products/1
        String url = "https://fakestoreapi.com/products/" + id;
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(url, FakeStoreProductDto.class);
        if(fakeStoreProductDto == null){
            throw new ProductNotFoundException("Product id was not found");
        }
        return convertDtoProduct(fakeStoreProductDto);
    }

    @Override
    public Product createProduct(CreateProductDto productDto) {
        return null;
    }

    private Product convertDtoProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setName(fakeStoreProductDto.getTitle());
//        product.setPrice(fakeStoreProductDto.getPrice());
        product.setDescription(fakeStoreProductDto.getDescription());
//        product.setImageUrl(fakeStoreProductDto.getImage());

        return product;
    }

}
