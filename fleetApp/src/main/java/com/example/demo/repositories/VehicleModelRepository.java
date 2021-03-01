package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.VehicleModel;

@Repository
public interface VehicleModelRepository<ClientRepository> extends JpaRepository<VehicleModel, Integer> {

}
