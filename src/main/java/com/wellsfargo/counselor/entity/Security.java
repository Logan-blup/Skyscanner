package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private LocalDate PurchaseDate;
    @Column(nullable = false)
    private Integer PurchasePrice;
    @Column(nullable = false)
    private Integer Quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    public Security(String name, String category, LocalDate purchaseDate, Integer purchasePrice, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.PurchaseDate = purchaseDate;
        this.PurchasePrice = purchasePrice;
        this.Quantity = quantity;
        this.portfolio = portfolio;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public Integer getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    protected Security(){

    }


}
