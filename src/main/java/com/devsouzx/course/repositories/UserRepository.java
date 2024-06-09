package com.devsouzx.course.repositories;

import com.devsouzx.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}