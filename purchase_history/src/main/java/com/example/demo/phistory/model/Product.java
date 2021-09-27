package com.example.demo.phistory.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(nullable = false)
    public int id;
    
    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public int pricae;

    @Column(nullable = false)
    public LocalDateTime date;

    @Column(nullable = false)
    public String infomation;

    @Column(nullable = false)
    public String image;

    public Product() {
        this("",0,"");
    }

    public Product( String _name , int _pricae ,String _infomation) {
        this.name = _name;
        this.pricae = _pricae;
        this.date = LocalDateTime.now();
        this.infomation = _infomation;
        this.image = "";
    }

}