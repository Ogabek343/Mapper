package com.example.mapper.repo;

import com.example.mapper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MessageRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
