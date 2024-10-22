package com.example.demo.mapped_super_class;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class User {
    @Id
    int id;
    String name;
    String email;
    String password;
}
