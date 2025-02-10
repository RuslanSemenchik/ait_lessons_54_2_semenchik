package de.ait.homework37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI {
    public static void main(String[] args) {
        //  1. Используя Stream API, отфильтруйте страны, названия которых начинаются на букву "C".
        List<String> countries = Arrays.asList("Germany", "France", "Brazil", "Argentina", "Canada", "China", "Australia", "India");

        List<String> countriesResult = countries.stream().filter(coutrie -> coutrie.startsWith("C")).collect(Collectors.toList());
        System.out.println(countriesResult);

        //  2.  Используя Stream API, отфильтруйте города, название которых длиннее 6 символов

        List<String> cities = Arrays.asList("Berlin", "Buenos Aires", "Paris", "Los Angeles", "New York", "London", "Beijing");

        List<String> citiesResult = cities.stream().filter(city -> city.trim().length() > 6).collect(Collectors.toList());
        System.out.println(citiesResult);

        //  3.  Используя Stream API, отфильтруйте только те реки, у которых чётное количество букв в названии.
        List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");
        List<String> riversResult = rivers.stream().filter(river -> river.length() % 2 == 0).collect(Collectors.toList());
        System.out.println(riversResult);

        //  4.  Используя Stream API, отфильтруйте континенты, у которых название короче 7 символов.

        List<String> continents = Arrays.asList("Europe", "Asia", "Africa", "Australia", "Antarctica", "South America", "North America");
        List<String> continentsResult = continents.stream().filter(continent -> continent.trim().length() < 7).collect(Collectors.toList());
        System.out.println(continentsResult);

        //   5. Используя Stream API, отфильтруйте страны, название которых состоит из 6 букв.

        List<String> countries2 = Arrays.asList("Mexico", "Sweden", "Brazil", "Russia", "Canada", "France", "Norway");
        List<String> countries2Result = countries2.stream().filter(countrie -> countrie.trim().length() == 6).collect(Collectors.toList());
        System.out.println(countries2Result);

        //   6.  Используя Stream API, отфильтруйте страны, названия которых содержат букву "a".

        List<String> countries3Result = countries2.stream().filter(countrie -> countrie.contains("a")).collect(Collectors.toList());
        System.out.println(countries3Result);

        //  7.   Используя Stream API, отфильтруйте города, у которых название заканчивается на "o".
        List<String> cities2Result = cities.stream().filter(city -> city.endsWith("o")).collect(Collectors.toList());
        System.out.println(cities2Result);

        //  8.   Используя Stream API, отфильтруйте реки, название которых содержит более 7 букв.
        List<String> riversResult2 = rivers.stream().filter(river -> river.length() > 7).collect(Collectors.toList());
        System.out.println(riversResult2);

        //  9.   Используя Stream API, отфильтруйте континенты, названия которых начинаются на "A".

        List<String> continents2Result = continents.stream().filter(continent -> continent.startsWith("A")).collect(Collectors.toList());
        System.out.println(continents2Result);

    }


}

