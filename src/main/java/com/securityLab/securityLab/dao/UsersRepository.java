package com.securityLab.securityLab.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securityLab.securityLab.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String>{
	
//	Optional<Users> checkUser(String email, String password);

}
