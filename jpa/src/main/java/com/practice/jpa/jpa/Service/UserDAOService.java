package com.practice.jpa.jpa.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.practice.jpa.jpa.entity.User;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public int insert(User user) {
		
		entityManager.persist(user);
		return user.getId();
	}

}
