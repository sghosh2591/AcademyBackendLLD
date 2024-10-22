package com.example.demo.table_per_class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name = "pc_user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    int id;
    String name;
    String email;
    String password;
}
