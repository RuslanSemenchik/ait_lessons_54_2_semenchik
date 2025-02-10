package de.ait.homework36;
/*
Задание 1: Расчёт времени следующего приёма пациента
Описание:
В медицинской клинике пациенты приходят на приём с определённым интервалом, например, раз в 6 месяцев. Напишите программу, которая принимает дату последнего визита пациента (LocalDate) и рассчитывает дату следующего визита.

Требования:
Запросить у пользователя дату последнего визита в формате dd.MM.yyyy.
Рассчитать дату следующего визита через 6 месяцев.
Если следующий визит выпадает на выходной (субботу или воскресенье), перенести его на ближайший понедельник.
Вывести результат в формате dd MMMM yyyy.
Пример вывода:

Введите дату последнего визита (dd.MM.yyyy): 10.02.2023
Дата следующего визита: 12 августа 2023 (перенесено с выходного)
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HospitalTimeDateApp {
    private static final Logger log = LoggerFactory.getLogger(HospitalTimeDateApp.class);
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите дату вашего последнего визита в следующем формате : (ДД.ММ.ГГГГ)");
        try {

            String inputUserLastVisit = scanner.nextLine();
            if (inputUserLastVisit == null) {
                System.out.println("Введенная дата :" + inputUserLastVisit + " является  null или пустой!");

                log.warn("Введенная дата :" + inputUserLastVisit + " является  null или пустой!");
            } else {

                DateTimeFormatter formatterUser = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate localLastVisit = LocalDate.parse(inputUserLastVisit, formatterUser);
                LocalDate localnextVisit = localLastVisit.plusMonths(6);
                DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


                DayOfWeek dayOfWeek = localnextVisit.getDayOfWeek();
                if (dayOfWeek == DayOfWeek.SATURDAY){

                    localnextVisit = localLastVisit.plusDays(2);

                    System.out.println("Следующий визит: " + localnextVisit.format(customFormatter)+ " (перенесено с выходного)");
                } else if (dayOfWeek == DayOfWeek.SUNDAY) {
                    localnextVisit = localLastVisit.plusDays(1);
                    System.out.println("Следующий визит: " + localnextVisit.format(customFormatter) + " (перенесено с выходного)");

                }

                else {
                    System.out.println("Следующий визит: " + localnextVisit.format(customFormatter));

                }


            }

        } catch (DateTimeException exception) {
            log.error(exception.getMessage());
        }




scanner.close();



    }

}

