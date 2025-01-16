package com.devcaio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
