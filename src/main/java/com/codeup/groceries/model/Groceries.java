package com.codeup.groceries.model;

import javax.persistence.*;


@Entity
@Table(name= "groceries")
public class Groceries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 250)
    private String description;

    public Groceries(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Groceries () {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
