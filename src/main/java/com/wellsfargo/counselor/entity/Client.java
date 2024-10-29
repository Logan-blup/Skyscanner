package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ClientId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String contact;


    @ManyToOne
    @JoinColumn(name="advisor_id", nullable = false)
    private Advisor advisor;

    @OneToOne
    @JoinColumn(name="portfolio_id", nullable = false)
    private Portfolio portfolio;

    protected Client(){

    }

    public Client(String name,String contact,Advisor advisor,Portfolio portfolio){
        this.name = name;
        this.contact = contact;
        this.advisor = advisor;
        this.portfolio = portfolio;

    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Advisor getAdvisorId() {
        return advisor;
    }

    public void setAdvisorId(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public long getClientId() {
        return ClientId;
    }

    public void setClientId(long clientId) {
        ClientId = clientId;
    }
}
