package com.devcaio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.project.entities.OrderItem;
import com.devcaio.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
