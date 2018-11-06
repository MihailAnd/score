package com.example.score.score.domain;


//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.time.LocalDateTime;
//
//
//@Entity
//public class Purchase {
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Id
//    private Integer id;
//
//    private User userId;
//
//    private Product product;
//
//    private LocalDateTime dateTime;
//
//    private Integer coast;
//
//    private Integer totalAmount;
//
//    public Purchase() {
//    }
//
//    public Purchase(User userId, Product product, LocalDateTime dateTime, Integer coast, Integer totalAmount) {
//        this.userId = userId;
//        this.product = product;
//        this.dateTime = dateTime;
//        this.coast = product.getPrice()*totalAmount;
//        this.totalAmount = totalAmount;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public User getUserId() {
//        return userId;
//    }
//
//    public void setUserId(User userId) {
//        this.userId = userId;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public LocalDateTime getDateTime() {
//        return dateTime;
//    }
//
//    public void setDateTime(LocalDateTime dateTime) {
//        this.dateTime = dateTime;
//    }
//
//    public Integer getCoast() {
//        return coast;
//    }
//
//    public void setCoast(Integer coast) {
//        this.coast = coast;
//    }
//
//    public Integer getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setTotalAmount(Integer totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//}
