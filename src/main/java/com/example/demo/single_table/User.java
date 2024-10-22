package com.example.demo.single_table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name = "st_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    int id;
    String name;
    String email;
    String password;
}
