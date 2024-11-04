package com.example.demo.generics;

public class Dog extends Animal {

    @Override
    public void getAnimalMeth() {
        System.out.println("Dog");
    }

    @Override
    public String getStrength() {
        return "Dog";
    }
}
