package com.example.demo.single_table;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class TA extends User {
    String college;
    String major;
}
