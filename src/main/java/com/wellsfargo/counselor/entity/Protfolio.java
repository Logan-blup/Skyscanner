package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Protfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int protfolioId;

    @OneToOne
    @JoinColumn(name="client_id",nullable = false)
    private Client clientId;

    @Column(nullable = false)
    private Date creationDate;
    @OneToMany(mappedBy="security",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Security> securities;

    public Protfolio() {
    }

    public Protfolio(int protfolioId, Client clientId, Date creationDate, List<Security> securities) {
        this.protfolioId = protfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
        this.securities = securities;
    }

    public int getProtfolioId() {
        return protfolioId;
    }

    public Client getClientId() {
        return clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setProtfolioId(int protfolioId) {
        this.protfolioId = protfolioId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
