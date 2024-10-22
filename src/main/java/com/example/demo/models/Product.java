package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
     long id;
     String name;
     double price;
     String description;
     String imageUrl;
}
