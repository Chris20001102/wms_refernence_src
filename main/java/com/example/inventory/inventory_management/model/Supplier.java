package com.example.inventory.inventory_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Supplier {

    @Id
    private Long supplierID;
    private String supplierName;
    private String supplierAddress;
    private String supplierTel;

    public Supplier(Long ID, String name, String address, String tell) {
        this.supplierID = ID;
        this.supplierName = name;
        this.supplierAddress = address;
        this.supplierTel = tell;

    }

    public Supplier() {

    }
}
