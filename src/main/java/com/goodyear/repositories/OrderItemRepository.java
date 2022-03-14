package com.goodyear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodyear.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
