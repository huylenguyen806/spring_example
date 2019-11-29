package com.example.springexample.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Film {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date release_date;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Film(String name, Date release_date) {
        this.name = name;
        this.release_date = release_date;
    }

    public String getName() {
        return name;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
}
