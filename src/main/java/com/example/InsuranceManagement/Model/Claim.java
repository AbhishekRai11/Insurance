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


}
