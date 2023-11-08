package com.Hdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
