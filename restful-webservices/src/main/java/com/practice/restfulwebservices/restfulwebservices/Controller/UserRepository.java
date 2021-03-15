package com.practice.restfulwebservices.restfulwebservices.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.restfulwebservices.restfulwebservices.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
