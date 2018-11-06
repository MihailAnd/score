package com.example.score.score.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE", unique = true)
    @Type(type = "text")
    private String title;

    @Column(name = "DESCRIPTION")
   @Type(type = "text")
    private String description;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "AMOUNT")
    private Integer amount;

    public Product() {
    }

      public Product( String title, String description, Integer price, Integer amount) {

        this.title = title;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

