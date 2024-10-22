package com.example.demo.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "mc_ta")
public class TA extends User{
    String college;
    String major;
}
