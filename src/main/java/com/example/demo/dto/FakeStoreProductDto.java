package com.example.demo.dto;

import lombok.Getter;

import java.util.UUID;

@Getter
public class FakeStoreProductDto {

    UUID id;
    String title;
    double price;
    String description;
    String category;
    String image;
}
