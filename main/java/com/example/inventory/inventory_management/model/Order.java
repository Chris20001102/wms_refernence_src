package com.example.inventory.inventory_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Order {
    @Id
    private String orderID;
    private Integer orderSum;

    public Order(String ID, Integer sum) {
        this.orderID = ID;
        this.orderSum = sum;
    }

    public Order() {

    }
}
