package de.ait.homework34;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SimpleBooking simpleBooking = new SimpleBooking();


        Faker faker = new Faker();
try {
    simpleBooking.bookRoom(0, faker.name().lastName());
    simpleBooking.bookRoom(1, null);
} catch (IllegalArgumentException exception) {
    log.error(" Guest name is empty or null");
    System.out.println("Guest name is empty or null");

}




    }
}
