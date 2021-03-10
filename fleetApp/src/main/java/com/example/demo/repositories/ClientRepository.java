package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Client;

@Repository
public interface ClientRepository<ClientRepository> extends JpaRepository<Client, Integer> {

}