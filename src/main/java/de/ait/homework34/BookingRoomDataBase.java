package de.ait.homework34;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookingRoomDataBase {
    private static final Logger log = LoggerFactory.getLogger(BookingRoomDataBase.class);
    private  int[] rooms = {101, 102, 103, 201, 202};
    private String [] guests = new String[5];

    public void addGuest ( int roomIndex,String guestName){
        if (roomIndex < 0 || roomIndex >= rooms.length) {
            log.error("Wrong room index");
            throw new ArrayIndexOutOfBoundsException("Wrong room index");

        }
    }

}
