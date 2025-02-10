package de.ait.homework36;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int years = LocalDate.now().getYear();
        System.out.println(years);
    }
}
