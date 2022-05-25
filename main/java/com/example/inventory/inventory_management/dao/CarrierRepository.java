package com.example.inventory.inventory_management.dao;

import com.example.inventory.inventory_management.model.Carrier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier, Long> {

}
