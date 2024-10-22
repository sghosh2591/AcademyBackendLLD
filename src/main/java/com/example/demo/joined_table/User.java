package com.example.demo.joined_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "jt_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    int id;
    String name;
    String email;
    String password;
}
