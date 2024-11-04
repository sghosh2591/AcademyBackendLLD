package com.example.demo.generics;

public class Animal implements Strengths{

    public void getAnimalMeth(){
        System.out.println("Animal");
    }

    @Override
    public String getStrength() {
        return "Animal";
    }
}
