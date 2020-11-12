package com.example.demo.databaseUtils.repositories;

import com.example.demo.databaseUtils.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {


}
