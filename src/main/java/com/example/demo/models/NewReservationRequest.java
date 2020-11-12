package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewReservationRequest {
    private final long fromDate;
    private final long toDate;
    private final long guestId;
    private final long roomId;
}
