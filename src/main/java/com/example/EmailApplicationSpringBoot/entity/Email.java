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
public class Email {

    @Id
    @GeneratedValue()
    private Long emailTransactionNo;
    private String fromEmailId;
    private String toEmailId;
    private String subject;
    private String body;
}
