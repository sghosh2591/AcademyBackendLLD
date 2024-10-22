package com.example.demo.table_per_class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "pc_ta")
public class TA extends User {
    String college;
    String major;
}
