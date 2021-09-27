package com.example.demo.phistory.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "List")
public class Lists {
    @Id
    @Column(nullable = false)
    public int list2_id;

    @Column(nullable = false)
     public String list_name ;
    
    @Column(nullable = false)
    public String office_name;

    @Column(nullable = false)
    public String street_adress;
     
    @Column(nullable = false)
    public String tel_number;

    @Column(nullable = false)
    public String mail_adress;

    @Column(nullable = false)
    public String responce_name;

    @Column(nullable = false)
    public int review;
 }
