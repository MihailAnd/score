package com.example.score.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private User client;

    private Integer pay;

    @OneToMany(mappedBy = "purchase", fetch = FetchType.LAZY)
    private List<PurchaseItem> positions ;

    private Integer phonenumber;

    private String delivery;

    private String fullname;

    private String address;

    private String city;

    private LocalDateTime dateTime;

    public Purchase() {
    }

    public Purchase( User client, Integer pay, Integer phonenumber,

                    String delivery, String fullname, String address, String city, LocalDateTime dateTime) {

        this.client = client;
        this.pay = pay;
        this.phonenumber = phonenumber;
        this.delivery = delivery;
        this.address = address;
        this.city = city;
        this.fullname = fullname;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public List<PurchaseItem> getPositions() {
        return positions;
    }

    public void setPosition(List<PurchaseItem> positions) {
        this.positions = positions;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
