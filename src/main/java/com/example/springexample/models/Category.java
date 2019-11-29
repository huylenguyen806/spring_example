package com.example.springexample.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private LocalDate created_date;

    @OneToMany(mappedBy = "category")
    private List<Film> films;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
        this.created_date = LocalDate.now();
    }
}
