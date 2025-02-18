package de.ait.homework39;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WeatherApp {
    public static void main(String[] args) {
        //Задание 1: Фильтрация данных по температуре
        // 1. Найти все записи (Weather), у которых температура опускается ниже нуля.
        // 2. Вывести результат в удобном для вас формате (например, список или строку).
        // Подсказка • Используйте фильтрацию (filter) по условию temperature < 0.
        System.out.println(getWeatherMinusZero());
        System.out.println(getBooleanIsCityTemperatureOver25());
        System.out.println(getCityMaxTemperature());
    }

    public static List<Weather> getWeatherMinusZero() {
        List<Weather> weatherMinusZero = WeatherTestData.getWeatherList().stream()
                .filter(t -> t.getTemperature() < 0)
                .collect(Collectors.toList());
        return weatherMinusZero;

    }
    // Задание 2: Проверка условий и нахождение максимума
        /*
        Состоит из двух частей: 1. Определить, есть ли хотя бы один город с температурой выше
        определённого порога (например, 25 градусов).

        2. Найти город (объект Weather) с максимальной температурой.

Подсказка • Для проверки какого-либо условия можно использовать anyMatch.
           • Для поиска максимума используйте max с Comparator по температуре.
           */

    public static boolean getBooleanIsCityTemperatureOver25() {
        boolean isCityTemperatureOver25 = WeatherTestData.getWeatherList().stream()
                .anyMatch(weather -> weather.getTemperature() > 25);
        return isCityTemperatureOver25;
    }

    public static Optional<Weather> getCityMaxTemperature() {
        Optional<Weather> cityMaxTemperature = WeatherTestData.getWeatherList().stream()
                .max(Comparator.comparingDouble(Weather::getTemperature));
        return cityMaxTemperature;
    }

}


