package com.example.demo.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    private void intermidiateOperations(){
        List<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(22);
        integers.add(11);
        integers.add(43);
        integers.add(5);
        integers.add(11);
        integers.add(100);
        integers.add(43);

        List<StudentStreams> studentStreams = new ArrayList<>();
        studentStreams.add(new StudentStreams("john",22));
        studentStreams.add(new StudentStreams("smith",11));
        studentStreams.add(new StudentStreams("Karen",43));
        studentStreams.add(new StudentStreams("chuno",5));
        studentStreams.add(new StudentStreams("churoolto",11));
        studentStreams.add(new StudentStreams("Boka",100));
        studentStreams.add(new StudentStreams("Vetki",43));
        studentStreams.add(new StudentStreams("Dhamni",5));

        //Filter
//        integers.stream().filter(integer -> integer % 2 ==1).forEach(System.out::println);

        //Map
//        integers.stream().map(integer -> integer * integer).forEach(System.out::println);

        //Distinct
//        integers.stream().distinct().forEach(System.out::println);

        //Sorted
//        integers.stream().sorted().forEach(System.out::println);

        // Custom Sort using Comparator
        studentStreams.stream().sorted((StudentStreams o1, StudentStreams o2) -> o2.getAge() - o1.getAge()
        ).forEach(System.out::println);
    }

    private void terminalOperations() {
        List<StudentStreams> studentStreams = new ArrayList<>();
        studentStreams.add(new StudentStreams("john", 22));
        studentStreams.add(new StudentStreams("smith", 11));
        studentStreams.add(new StudentStreams("Karen", 43));
        studentStreams.add(new StudentStreams("chuno", 5));
        studentStreams.add(new StudentStreams("churoolto", 11));
        studentStreams.add(new StudentStreams("Boka", 100));
        studentStreams.add(new StudentStreams("Vetki", 43));
        studentStreams.add(new StudentStreams("Dhamni", 5));

        // Collect
//        List<StudentStreams> students = studentStreams.stream().distinct().collect(Collectors.toList());
//        for (StudentStreams studentStream : students) {
//            System.out.println(studentStream.toString());
//        }

        //Reduce
        int sum = studentStreams.stream().map(students1 -> students1.getAge()).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        StreamsDemo demo = new StreamsDemo();
//        demo.intermidiateOperations();
        demo.terminalOperations();
    }
}
