package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.State;

@Repository
public interface StateRepository<ClientRepository> extends JpaRepository<State, Integer> {

}
