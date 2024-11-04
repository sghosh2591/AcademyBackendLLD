package com.example.demo.comparable;

import com.example.demo.comparator.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Initializer {

    public static void main(String[] args) {
        List<StudentComparable> students = new ArrayList<>();
        students.add(new StudentComparable("Fred", 40));
        students.add(new StudentComparable("Alice", 20));
        students.add(new StudentComparable("Bob", 25));
        students.add(new StudentComparable("Charlie", 22));
        students.add(new StudentComparable("David", 30));
        students.add(new StudentComparable("Ellie", 35));

        Collections.sort(students);
        for(StudentComparable s:students){
            System.out.println(s.getName()+" "+s.getAge());
        }
    }
}
