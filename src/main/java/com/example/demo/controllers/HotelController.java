package com.example.demo.controllers;

import com.example.demo.databaseUtils.entity.Hotel;
import com.example.demo.databaseUtils.repositories.HotelRepository;
import com.example.demo.exceptions.HotelNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/hotel")
public class HotelController {

    private HotelRepository hotelRepository;

    @RequestMapping("/")
    public String login() {
        return "login";
    }


    @GetMapping("/all")
    public Collection<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable long id) {
        return hotelRepository
                .findById(id)
                .orElseThrow(() -> new HotelNotFoundException(String.format("Hotel o id %s nie znaleziono", id)));
    }


}
