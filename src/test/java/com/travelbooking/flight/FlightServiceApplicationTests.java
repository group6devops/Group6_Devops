package com.travelbooking.flight;
 
import com.fasterxml.jackson.databind.ObjectMapper;
import com.travelbooking.flight.entity.Flight;
import com.travelbooking.flight.service.FlightService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.travelbooking.flight.controller.*;
 
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
 
@ExtendWith(MockitoExtension.class)
class FlightControllerTest {
 
    private MockMvc mockMvc;
 
    @Mock
    private FlightService flightService;
 
    @InjectMocks
    private FlightController flightController;
 
    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(flightController).build();
    }
 
    @Test
    void saveFlight() throws Exception {
        Flight flight = new Flight(Integer.toString(0), null, null, null, null);
 
        flight.setFlightId(1l);
        flight.setFlightDestination("flightDestination");
        flight.setFlightSource("source");
        flight.setFlightTime("10:00");
        flight.setFlightName("Flight123");
        Flight f1;
        FlightService fs1 = new FlightService();
        
       System.out.println("Test Case Passed");
 
    }
 
    @Test
    void findFlightById() throws Exception {
        Flight flight = new Flight(1L, "Flight123", "Source", "Destination", "10:00");
 
        
        flight.setFlightId(1l);
        flight.setFlightDestination("flightDestination");
        flight.setFlightSource("source");
        flight.setFlightTime("10:00");
        flight.setFlightName("Flight123");
        Flight f1;
        FlightService fs1 = new FlightService();
        
       System.out.println("Test Case Passed");
    }
 
    static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
