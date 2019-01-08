package com.example.score.domain;


import javax.persistence.*;
import java.io.Serializable;


@Entity
public class CartItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    @ManyToOne
    @JoinColumn(name = "product_id", unique = false)
    private Product product;



    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Cart_id")
    private Cart cart;

    private Integer productAmount;



    public CartItem() { }




    public CartItem(Product product, Cart cart, Integer productAmount) {
        this.product = product;
        this.cart = cart;
        this.productAmount = productAmount;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

}
