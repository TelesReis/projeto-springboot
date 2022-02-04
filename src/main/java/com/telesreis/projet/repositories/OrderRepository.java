package com.telesreis.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telesreis.projet.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}