package com.example.demo.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Initializer {


    public static void compareStudentByAge(List<Student> students) {
        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        students.sort(ageComparator);
    }

    public static void compareStudentByName(List<Student> students) {
        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        students.sort(nameComparator);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Fred", 40));
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 25));
        students.add(new Student("Charlie", 22));
        students.add(new Student("David", 30));
        students.add(new Student("Ellie", 35));


//        compareStudentByAge(students);
        compareStudentByName(students);

        for(Student s:students){
            System.out.println(s.getName()+" "+s.getAge());
        }
    }
}
