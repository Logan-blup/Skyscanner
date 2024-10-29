package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long PortfolioId;

    @OneToOne
    @JoinColumn(name="client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Security> securities;


    protected Portfolio(){
    }

    public Portfolio(Set<Security> securities) {
        this.securities = securities;
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    public long getPortfolioId() {
        return PortfolioId;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPortfolioId(long portfolioId) {
        PortfolioId = portfolioId;
    }
}
