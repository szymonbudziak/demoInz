package com.example.demo.databaseUtils.repositories;

import com.example.demo.databaseUtils.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
