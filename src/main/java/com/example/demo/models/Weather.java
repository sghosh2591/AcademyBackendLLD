package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {

    String name;
    long id;
    long timezone;
    long visibility;
    String coord;
    String main;
    String wind;
//    String message;
}
