package com.example.score.domain;

import javax.persistence.*;

@Entity
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer purchaseProd;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

    public PurchaseItem() {
    }

    public PurchaseItem(Integer purchaseProd, Integer quantity) {
        this.purchaseProd = purchaseProd;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseProd() {
        return purchaseProd;
    }

    public void setPurchaseProd(Integer purchaseProd) {
        this.purchaseProd = purchaseProd;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
