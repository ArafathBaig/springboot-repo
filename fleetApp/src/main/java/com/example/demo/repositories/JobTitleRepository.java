package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.JobTitle;

@Repository
public interface JobTitleRepository<ClientRepository> extends JpaRepository<JobTitle, Integer> {

}
