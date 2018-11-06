package com.example.score.score.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class Purchase {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private User user;

    private Product product;

    private LocalDateTime dateTime;

    private Integer coast;

    private Integer productAmount;

    public Purchase() {
    }

    public Purchase(User user, Product product, LocalDateTime dateTime, Integer coast, Integer productAmount) {
        this.user = user;
        this.product = product;
        this.dateTime = dateTime;
        this.coast = coast;
        this.productAmount = productAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getCoast() {
        return coast;
    }

    public void setCoast(Integer coast) {
        this.coast = coast;
    }

    public Integer getTotalAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }
}
