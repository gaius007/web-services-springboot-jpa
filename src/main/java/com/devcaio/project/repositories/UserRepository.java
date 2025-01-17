package com.devcaio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
