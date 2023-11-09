package com.Hdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hdev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
