package com.devcaio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
