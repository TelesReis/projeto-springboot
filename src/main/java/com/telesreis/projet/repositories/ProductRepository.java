package com.telesreis.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telesreis.projet.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
