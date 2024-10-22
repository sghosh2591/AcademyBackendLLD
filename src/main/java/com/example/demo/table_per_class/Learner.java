package com.example.demo.table_per_class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity(name = "pc_Learner")
@Data
public class Learner extends User {
    String college;
    String company;
}
