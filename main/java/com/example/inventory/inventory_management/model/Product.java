package com.example.inventory.inventory_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    private String productID;
    private String productPrice;
    private String productName;
    private String productType;

    public Product(String ID, String price, String name, String type) {
        this.productID = ID;
        this.productPrice = price;
        this.productName = name;
        this.productType = type;
    }

    public Product() {

    }
}
