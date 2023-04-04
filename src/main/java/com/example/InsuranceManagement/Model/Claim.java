package com.example.InsuranceManagement.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "claim")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private int claimNumber;

    private String description;

    @CreationTimestamp
    private Date claimDate;


    private String status;

    @OneToOne
    @JoinColumn
    private InsurancePolicy insurancePolicy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(int claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public Claim(int id, int claimNumber, String description, Date claimDate, String status, InsurancePolicy insurancePolicy) {
        this.id = id;
        this.claimNumber = claimNumber;
        this.description = description;
        this.claimDate = claimDate;
        this.status = status;
        this.insurancePolicy = insurancePolicy;
    }

    public Claim() {
    }
}
