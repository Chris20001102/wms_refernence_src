package com.example.inventory.inventory_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    private String customerID;
    private String customerName;
    private String customerAddress;

    public Customer(String ID, String name, String address) {
        this.customerID = ID;
        this.customerName = name;
        this.customerAddress = address;
    }

    public Customer() {

    }
}
