package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.VehicleType;

@Repository
public interface VehicleTypeRepository<ClientRepository> extends JpaRepository<VehicleType, Integer> {

}
