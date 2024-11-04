package com.example.demo.generics;


// Concept of extends and multiple bounds with interface & symbol
public class Species<T extends Animal & Strengths>{
    private T animal;

    public Species(T animal){
        this.animal = animal;
    }

    public T getAnimal(){
        return animal;
    }


}
