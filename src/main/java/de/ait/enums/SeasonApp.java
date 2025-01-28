package de.ait.enums;

public class SeasonApp {
    public static void main(String[] args) {
        Season season = Season.FALL;
        System.out.println("Season : " +season + ", averagetemperature : " + season.getAverageatemperature());

        Season season1 = Season.valueOf("SPRING");
        System.out.println(season1);
        switch (season1){
            case SPRING -> {
                System.out.println("Season : " +season1 + ", averagetemperature : " + + season1.getAverageatemperature()+ " max :" + season1.getMax() + " min :" +season1.getMin());
                break;
            }
            case FALL -> {
                System.out.println("Season : " + season1 + ", averagetemperature : " + season1.getAverageatemperature()+ " max :" + season1.getMax() + " min :" +season1.getMin());
                break;
            }
            case SUMMER -> {
                System.out.println("Season : " +season1 + ", averagetemperature : " + season1.getAverageatemperature()+ " max :" + season1.getMax() + " min :" +season1.getMin());

            }
            case WINTER -> {
                System.out.println("Season : " +season1 + ", averagetemperature : " + + season1.getAverageatemperature()+ " max :" + season1.getMax() + " min :" +season1.getMin());
            }
            default -> {
                System.out.println("Not avelable");
            }
        }





    }
}
