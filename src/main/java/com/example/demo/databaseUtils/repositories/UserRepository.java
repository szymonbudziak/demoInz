package com.example.demo.databaseUtils.repositories;

import com.example.demo.databaseUtils.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNickname(String nickname);

    List<User> findAll();
}
