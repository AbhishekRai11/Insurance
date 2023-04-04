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
}
