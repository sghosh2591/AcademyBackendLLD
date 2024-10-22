package com.example.demo.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name = "mc_Learner")
@Data
public class Learner extends User{
    String college;
    String company;
}
