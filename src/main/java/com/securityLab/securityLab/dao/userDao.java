package com.securityLab.securityLab.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.securityLab.securityLab.entity.Users;



@Repository
@Transactional
public class userDao {

	@PersistenceContext
	EntityManager em;
	
	public boolean checkUser(String email, String pass) {
		Users p = findUser(email);
		if(p == null) {
			return false;
		}
		if (p.getPassword().equals(pass)) {
			return true;
		} else
			return false;	
	}
	
	public Users findUser(String email) {

		return em.find(Users.class, email);
	}
}
