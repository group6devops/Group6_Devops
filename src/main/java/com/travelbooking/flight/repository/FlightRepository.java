package com.travelbooking.flight.repository;

import com.travelbooking.flight.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{
	
	Flight findByFlightId(Long flightId);

}
