package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.UUID;

@Data
@Entity
public class Product {

     @Id
     @GeneratedValue(strategy = GenerationType.UUID)
     UUID id;

     String name;
     String description;
     String category;
}
