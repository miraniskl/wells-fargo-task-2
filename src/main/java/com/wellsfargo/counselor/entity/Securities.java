package com.wellsfargo.counselor.entity;


import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Securities {

    @Id
    @GeneratedValue()
    private long securityID;

    private String symbol;
    private String type;
    private int quantity;
    private int purchase_price;


    @Column(nullable = false)
    private long portfolio_id;
    

    protected Securities() {

    }

    public Securities(String symbol, String type, int quantity, int purchase_price, long portfolio_id) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.purchase_price = purchase_price;
        this.portfolio_id = portfolio_id;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public String getSymbol(){
        return this.symbol;
    }

    public Long getSecurityID() {
        return this.portfolio_id;
    }
    
    public Long setSecurityID() {
        return this.portfolio_id;
    }

    public void setPortfolioId(long portfolio_id) {
        this.portfolio_id= portfolio_id;
    }

    public Long getPortfolioId() {
        return this.portfolio_id;
    }

    public String setType() {
        return this.type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPurchase_price(int purchase_price){
        this.purchase_price = purchase_price;
    }

    public int getPurchase_price(){
        return this.purchase_price;
    }



}

