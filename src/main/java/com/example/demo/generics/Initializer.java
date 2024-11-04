package com.example.demo.generics;

import java.util.ArrayList;

public class Initializer {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(4,"Saurav");
        System.out.println("Key: "+pair.getKey()+" Value: "+pair.getValue());

        Species<Cat> animalSpecies = new Species<>(new Cat());
        animalSpecies.getAnimal().getAnimalMeth();
        animalSpecies.getAnimal().getStrength();

        TestWildCard wildCard = new TestWildCard();
        wildCard.checkWildcard();

        ArrayList<String> cats = new ArrayList<>();
        cats.add("Saurav");
        cats.add("John");
        cats.add("Sam");
        Pair<String,String> pair1 = new Pair<>("messe","ronaldo");
        System.out.println(Pair.getFirstItemOFList(cats));
    }
}
