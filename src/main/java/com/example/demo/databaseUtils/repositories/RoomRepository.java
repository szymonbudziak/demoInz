package com.example.demo.databaseUtils.repositories;

import com.example.demo.databaseUtils.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
