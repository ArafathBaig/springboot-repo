package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.VehicleHire;

@Repository
public interface VehicleHireRepository<ClientRepository> extends JpaRepository<VehicleHire, Integer> {

}
