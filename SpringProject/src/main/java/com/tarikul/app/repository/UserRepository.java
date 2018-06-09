package com.tarikul.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarikul.app.entities.User;



public interface UserRepository extends JpaRepository<User, String>{

}
