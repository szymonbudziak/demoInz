package com.example.demo.exceptions;

public class ReservationNotFoundException extends RuntimeException {

    public ReservationNotFoundException(String msg) {
        super(msg);
    }
}
