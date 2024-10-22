package com.example.demo.single_table;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Mentor extends User {
    String noOfQuestions;
    String company;
}
