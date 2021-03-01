package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.EmployeeType;

@Repository
public interface EmplyeeTypeRepository<ClientRepository> extends JpaRepository<EmployeeType, Integer> {

}
