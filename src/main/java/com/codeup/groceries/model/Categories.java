package com.codeup.groceries.model;

import javax.persistence.*;

@Entity
@Table(name= "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 100)
    private String category;

    public Categories(long id, String category) {
        this.id = id;
        this.category = category;
    }

    public Categories() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
