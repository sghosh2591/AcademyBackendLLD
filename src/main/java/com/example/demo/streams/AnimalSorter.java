package com.example.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalSorter {


    private void checkExceptions(){
        try{
            String s = null;
            System.out.println("Null String"+s.length());
        }catch (NullPointerException e){
            String m = null;
            System.out.println("Null String"+m.length());
            System.out.println("NullPointer Exception");
        }finally {
            System.out.println("Finally");
        }
    }

    public static List<String> sortAnimalsByLengthDescending(List<String> animals) {

        if(animals.size() == 0){
            List<String> list = Arrays.asList();
            return list;
        }

        return animals.stream()
                .sorted((o1,o2) -> o2.length() - o1.length())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        List<String> animals = Arrays.asList("zebra", "lion", "tiger", "elephant", "giraffe");
//        List<String> sortedAnimals = sortAnimalsByLengthDescending(animals);
//        System.out.println(sortedAnimals);
//
//        animals = Arrays.asList("cat","dog","animal-x","elephant","mouse");
//        sortedAnimals = sortAnimalsByLengthDescending(animals);
//        System.out.println(sortedAnimals);
//
//        animals = Arrays.asList();
//        sortedAnimals = sortAnimalsByLengthDescending(animals);
//        System.out.println(sortedAnimals);
//
//        animals = Arrays.asList("a","b","d","c","a");
//        sortedAnimals = sortAnimalsByLengthDescending(animals);
//        System.out.println(sortedAnimals);

        AnimalSorter sorter = new AnimalSorter();
        sorter.checkExceptions();

    }
}
