package com.example.demo.databaseUtils.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "room")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hotel hotel;

    private long roomNumber;

    private long roomCapacity;

    private String pricePerDay;
}
