package com.jefferson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
