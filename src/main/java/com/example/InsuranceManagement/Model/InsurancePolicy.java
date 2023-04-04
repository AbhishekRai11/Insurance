package com.example.InsuranceManagement.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "insurancePolicy")
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private int insuraneNumber;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int coverageAmount;

    private String premium;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @OneToOne
    @JoinColumn
    private Client client;

    public InsurancePolicy(int id, int insuraneNumber, String type, int coverageAmount, String premium, Date startDate, Date endDate, Client client) {
        this.id = id;
        this.insuraneNumber = insuraneNumber;
        this.type = type;
        this.coverageAmount = coverageAmount;
        this.premium = premium;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
    }

    public InsurancePolicy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInsuraneNumber() {
        return insuraneNumber;
    }

    public void setInsuraneNumber(int insuraneNumber) {
        this.insuraneNumber = insuraneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(int coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
