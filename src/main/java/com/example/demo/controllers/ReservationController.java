package com.example.demo.controllers;

import com.example.demo.databaseUtils.entity.Room;
import com.example.demo.databaseUtils.repositories.ReservationRepository;
import com.example.demo.databaseUtils.repositories.RoomRepository;
import com.example.demo.exceptions.ReservationNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private ReservationRepository reservationRepository;
    private RoomRepository roomRepository;

    /*@PostMapping("/new")
    public void postReservation(@RequestBody NewReservationRequest newReservationRequest) {
        Reservation reservation = transformToReservationEntity(newReservationRequest);
        reservationRepository.save(reservation);
    }*/

    @DeleteMapping("/{reservationId}")
    public void deleteReservation(@PathVariable long reservationId) {
        reservationRepository.findById(reservationId)
                .orElseThrow(() -> new ReservationNotFoundException(format("Rezerwacja o id %s nie znaleziono", reservationId)));
        reservationRepository.deleteById(reservationId);
    }

/*    private Reservation transformToReservationEntity(NewReservationRequest reservationRequest) {
        return Reservation.builder()
                .fromDate(LocalDateTime.ofInstant(Instant.ofEpochMilli(reservationRequest.getFromDate()), ZoneId.systemDefault()))
                .toDate(LocalDateTime.ofInstant(Instant.ofEpochMilli(reservationRequest.getToDate()), ZoneId.systemDefault()))
                .guest(findGuest(reservationRequest.getGuestId()))
                .room(findRoom(reservationRequest.getRoomId()))
                .build();
    }*/


    private Room findRoom(long roomId) {
        return roomRepository.getOne(roomId);
    }

}
