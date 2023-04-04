package com.example.InsuranceManagement.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String contactInformatiom;

    public Client() {
    }


    public Client(int id, String name, Date dateOfBirth, String address, String contactInformatiom) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.contactInformatiom = contactInformatiom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInformatiom() {
        return contactInformatiom;
    }

    public void setContactInformatiom(String contactInformatiom) {
        this.contactInformatiom = contactInformatiom;
    }
}
