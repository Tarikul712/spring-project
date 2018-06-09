package com.tarikul.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarikul.app.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String>{

}
