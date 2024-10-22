package com.example.demo.single_table;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Learner extends User {
    String college;
    String company;
}
