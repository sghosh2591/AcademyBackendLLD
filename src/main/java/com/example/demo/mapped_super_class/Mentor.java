package com.example.demo.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "mc_mentor")
public class Mentor extends User{
    String noOfQuestions;
    String company;
}
