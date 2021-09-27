package com.example.demo.phistory.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "History")
public class History {
    @Id
    @Column(nullable = false)
     public int order_number;

    @Column(nullable = false)
     public int product_id;

    @Column(nullable = false)
     public int user_id;

    @Column(nullable = false)
     public int total_money;

    @Column(nullable = false)
     public int total_count;

    @Column(nullable = false)
     public LocalDate buy_date;
 }
    

