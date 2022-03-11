package com.goodyear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.goodyear.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
