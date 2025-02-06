package de.ait.lesson35;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FlightBooking {
    private static final Logger log = LoggerFactory.getLogger(FlightBooking.class);

    public void bookFlight(String flightNumber, String passengerName, int seatNumber){


            if (flightNumber == null || flightNumber.isEmpty()) {
                log.error(" Flight number is  null or empty");
                throw  new IllegalArgumentException("Flight number is null or empty");
            }

        if (passengerName == null || passengerName.isEmpty()) {
            log.error(" Passenger name is  null or empty");
            throw  new IllegalArgumentException("Passenger name is null or empty");
        }

        if (seatNumber <= 0 ) {
            log.error("Wrong seat number"+ seatNumber);
            throw new IllegalArgumentException("Wrong seat number"+ seatNumber);
        }


        log.info("Booking was successfull. Flight number :" + flightNumber+ " passenger Name:" + passengerName + " seat number:" + seatNumber );
        System.out.println("Booking was successfull. Flight number :" + flightNumber+ " passenger Name:" + passengerName + " seat number:" + seatNumber  );

        }
}
