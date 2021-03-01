package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Supplier;

@Repository
public interface SupplierRepository<ClientRepository> extends JpaRepository<Supplier, Integer> {

}
