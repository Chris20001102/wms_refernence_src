package com.example.inventory.inventory_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Location {
    @Id
    private String locationID;
    private String locationStatus;
    private Integer quality;
    private String uom;

    public Location(String ID, String status, Integer quality, String uom) {
        this.locationID = ID;
        this.locationStatus = status;
        this.quality = quality;
        this.uom = uom;
    }

    public Location() {

    }
}
