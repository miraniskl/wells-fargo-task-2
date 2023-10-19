package com.wellsfargo.counselor.entity;


import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.Calendar;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    private String date_created;
    private String firstName;
    private String lastName;


    @Column(nullable = false)
    private long client_id;
    

    protected Portfolio() {

    }

    public Portfolio(String firstName, String lastName, long client_id, String date_created) {
        this.client_id = client_id;
        this.date_created = date_created;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getClientId() {
        return this.client_id;
    }

    public void setClientId(long clientid) {
        this.client_id = clientid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateCreated(){
        return this.date_created;
    }


}

