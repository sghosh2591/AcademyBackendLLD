package com.example.demo.table_per_class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "pc_mentor")
public class Mentor extends User {
    String noOfQuestions;
    String company;
}
