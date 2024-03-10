package com.travelbooking.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.travelbooking.flight.entity.Flight;
import com.travelbooking.flight.service.FlightService;


@RestController
@RequestMapping("/flights")
public class FlightController {	
	@Autowired
	private FlightService flightService;	
    @PostMapping("/")
    public Flight saveFlifgt(@RequestBody Flight flight) {
        System.out.println("POST");
        return  flightService.saveFlight(flight);
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable("id") Long flightId) {
    	System.out.println("GET");
        return flightService.findFlightById(flightId);
    }

}
