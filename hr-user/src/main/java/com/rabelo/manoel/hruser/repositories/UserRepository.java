package com.rabelo.manoel.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabelo.manoel.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String Email);
}
