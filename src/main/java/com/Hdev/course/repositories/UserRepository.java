package com.Hdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
