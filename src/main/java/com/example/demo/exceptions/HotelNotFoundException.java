package com.example.demo.exceptions;

public class HotelNotFoundException extends RuntimeException {

    public HotelNotFoundException(String msg) {
        super(msg);
    }
}
