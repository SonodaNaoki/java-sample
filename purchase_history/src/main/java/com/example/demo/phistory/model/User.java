package com.example.demo.phistory.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String street_address;

    @Column(nullable = false)
    private String te_number;

    @Column(nullable = false)
    private String mail_address;
}