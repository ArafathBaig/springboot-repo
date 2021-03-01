package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.InvoiceStatus;

@Repository
public interface InvoiceStatusRepository<ClientRepository> extends JpaRepository<InvoiceStatus, Integer> {

}
