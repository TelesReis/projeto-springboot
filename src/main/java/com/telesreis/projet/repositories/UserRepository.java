package com.telesreis.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telesreis.projet.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
