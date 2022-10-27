package com.example.EmailApplicationSpringBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue()
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
}
