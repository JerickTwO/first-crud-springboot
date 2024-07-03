package dev.jerick.api.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity


@Table(name = "tbl_student")


public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String FirstName;

    private String lastName;

    @Column(name = "email_address",unique = true, nullable = false)

    private String email;
}










