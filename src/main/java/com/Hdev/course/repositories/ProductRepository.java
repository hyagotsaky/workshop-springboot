package com.Hdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
