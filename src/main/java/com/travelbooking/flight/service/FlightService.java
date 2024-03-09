package com.travelbooking.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelbooking.flight.entity.Flight;
import com.travelbooking.flight.repository.FlightRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public Flight saveFlight(Flight flight) {
        
        return flightRepository.save(flight);
    }
	
    public Flight findFlightById(Long flightId) {

        return flightRepository.findByFlightId(flightId);
    }
	
}
