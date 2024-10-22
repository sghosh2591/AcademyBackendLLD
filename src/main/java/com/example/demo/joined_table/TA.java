package com.example.demo.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_ta")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {
    String college;
    String major;
}
