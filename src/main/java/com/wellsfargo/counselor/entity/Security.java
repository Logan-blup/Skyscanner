package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int securityId;
    @Column(nullable = false)
    private int portfolioId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private String purchasePrice;
    @Column(nullable = false)
    private int quantity;

    public Security(int securityId, int portfolioId, String name, String category, String purchaseDate, String purchasePrice, int quantity) {
        this.securityId = securityId;
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
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

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Security{" +
                "securityId=" + securityId +
                ", portfolioId=" + portfolioId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", purchasePrice='" + purchasePrice + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
