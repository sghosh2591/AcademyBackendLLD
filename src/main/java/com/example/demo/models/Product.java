package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

     @Id
     long id;

     String name;
     double price;
     String description;
     String imageUrl;
}
