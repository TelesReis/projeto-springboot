package com.telesreis.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telesreis.projet.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
