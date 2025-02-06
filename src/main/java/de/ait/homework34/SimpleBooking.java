package de.ait.homework34;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SimpleBooking {
    private static final Logger log = LoggerFactory.getLogger(SimpleBooking.class);

    public void bookRoom(int roomNumber, String guestName) {
        if (roomNumber <= 0 ) {
            log.error("Wrong room number"+ roomNumber);
            throw new IllegalArgumentException("Wrong room number"+ roomNumber);
        }
        if (guestName == null || guestName.trim().isEmpty()) {
            log.error("Guest name is null or empty");
            throw  new IllegalArgumentException("Guest name is null or empty");
        }
        log.info("Booking was successfull. Room: {} Guest:{}", roomNumber, guestName);
        System.out.println("Booking was successfull. Room: " + roomNumber + " Guest:" + guestName);


    }
}

