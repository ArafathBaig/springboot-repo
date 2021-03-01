package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Location;

@Repository
public interface LocationRepository<ClientRepository> extends JpaRepository<Location, Integer> {

}
