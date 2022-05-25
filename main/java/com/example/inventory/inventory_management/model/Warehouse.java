package com.example.inventory.inventory_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Warehouse {
    @Id
    private String warehouseID;
    private String warehouseName;
    private String warehouseAddress;
    private String warehouseTel;

    public Warehouse(String ID, String name, String address, String tell) {
        this.warehouseID = ID;
        this.warehouseName = name;
        this.warehouseAddress = address;
        this.warehouseTel = tell;
    }

    public Warehouse() {

    }
}
