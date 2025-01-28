package de.ait.enums;

public class DayApp {
    public static void main(String[] args) {


        Day day = Day.MONDAY;
        System.out.println(day);
        if (day == Day.MONDAY){
            System.out.println("Halo Monday");
        }

        Day dayfromString = Day.valueOf("MONDAY");
        System.out.println(dayfromString);
    }

}
