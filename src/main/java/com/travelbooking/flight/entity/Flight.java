package com.travelbooking.flight.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Flight {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long flightId;
    private String flightName;
    private String flightSource;
    private String flightDestination;
    private String flightTime;

}
