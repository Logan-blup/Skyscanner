package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long clientId;


    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
    @OneToOne(mappedBy = "protofolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Protfolio protfolioId;

    public Client() {
    }

    public Client(long clientId, Advisor advisor, String firstName, String lastName, String address, String phone, String email, Protfolio protfolioId) {
        this.clientId = clientId;
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.protfolioId = protfolioId;
    }

    public long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Protfolio getProtfolioId() {
        return protfolioId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProtfolioId(Protfolio protfolioId) {
        this.protfolioId = protfolioId;
    }
}
