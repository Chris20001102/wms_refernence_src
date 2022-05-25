package com.example.inventory.inventory_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Carrier {
    @Id
    private Long carrierID;
    private String carrierType;

    public Carrier(Long ID, String type) {
        this.carrierID = ID;
        this.carrierType = type;
    }

    public Carrier() {

    }
}
