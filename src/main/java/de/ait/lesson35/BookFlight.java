package de.ait.lesson35;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class BookFlight {
    private static final Logger log = LoggerFactory.getLogger(BookFlight.class);

    public static void main(String[] args) {

        Faker faker = new Faker();
        FlightBooking flightBooking = new FlightBooking();
        try {
            flightBooking.bookFlight("101", faker.name().lastName(), 1);
            flightBooking.bookFlight("102", faker.name().lastName(), -1);
            flightBooking.bookFlight("", faker.name().lastName(), 3);
        } catch (IllegalArgumentException exception) {
            log.error(Arrays.toString(exception.getStackTrace()));
            System.out.println(exception.getMessage());
        }
}

}
