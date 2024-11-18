package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Entity
@DynamicInsert
@DynamicUpdate
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    public long getCustomerId() {
        return this.Id;
    }
    public void setCustomerId(long id) {
        this.Id = id;
    }
    @OneToMany(mappedBy = "customer")
    private List<Book> bookList;
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
