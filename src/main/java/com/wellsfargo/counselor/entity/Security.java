package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int security_id;
    @OneToMany
    @JoinColumn(name="protofolio_id",nullable = false)
    private int protofolio_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private float purchasePrice;
    @Column(nullable = false)
    private Date purchaseDate;
    @Column(nullable = false)
    private long qunatity;

    public Security() {
    }

    public Security(int security_id, int protofolio_id, String name, String category, float purchasePrice, Date purchaseDate, long qunatity) {
        this.security_id = security_id;
        this.protofolio_id = protofolio_id;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.qunatity = qunatity;
    }

    public int getSecurity_id() {
        return security_id;
    }

    public int getProtofolio_id() {
        return protofolio_id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public long getQunatity() {
        return qunatity;
    }

    public void setSecurity_id(int security_id) {
        this.security_id = security_id;
    }

    public void setProtofolio_id(int protofolio_id) {
        this.protofolio_id = protofolio_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQunatity(long qunatity) {
        this.qunatity = qunatity;
    }
}
