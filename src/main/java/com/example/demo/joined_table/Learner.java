package com.example.demo.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity(name = "jt_Learner")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
public class Learner extends User {
    String college;
    String company;
}
