package com.goodyear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodyear.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
