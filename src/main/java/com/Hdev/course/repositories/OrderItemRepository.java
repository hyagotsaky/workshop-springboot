package com.Hdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hdev.course.entities.Order;
import com.Hdev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
