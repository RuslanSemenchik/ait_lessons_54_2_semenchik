package de.ait.homework36;

import lombok.extern.slf4j.Slf4j;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*

Задание 2: Подсчёт оставшегося времени до операции
Описание:
Пациент записан на операцию в определённую дату и время. Напишите программу, которая определяет сколько времени осталось до операции (в днях, часах и минутах).

Требования:
Ввести дату и время операции в формате dd.MM.yyyy HH:mm.
Определить, сколько дней, часов и минут осталось до операции.
Вывести результат в понятном формате.
Пример вывода:

Дата и время операции (dd.MM.yyyy HH:mm): 25.06.2024 08:30
До операции осталось: 150 дней, 12 часов и 45 минут.

 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatientOPDateTime {
    public static Scanner scanner = new Scanner(System.in);
    private static final Logger log = LoggerFactory.getLogger(PatientOPDateTime.class);

    public static void main(String[] args) {


        System.out.println("Ввести дату и время операции в формате dd.MM.yyyy HH:mm");
        try {

            String inputPatientOPDateTime = scanner.nextLine();
            if (inputPatientOPDateTime == null || inputPatientOPDateTime.isEmpty()) {
                System.out.println("Введенная дата или время :" + inputPatientOPDateTime + " являются  null или пустыми!");


                log.warn("Введенная дата :" + inputPatientOPDateTime + " является  null или пустой!");
            } else {


                DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                LocalDate patientOPDateTime = LocalDate.parse(inputPatientOPDateTime, customFormatter);


                Duration duration = Duration.between( LocalDateTime.now(), patientOPDateTime.atStartOfDay());
                long days = duration.toMinutes()/1440;
                long remainOfDay = duration.toMinutes()%1440;
                long hoursTime = remainOfDay/60;
                long minTime = remainOfDay%60;

                System.out.println("До операции осталось:  " + days + " дней, "+ hoursTime + " часов,  и " + minTime + " минут. ");


                log.info("До операции осталось:  " + days + " дней, "+ hoursTime + " часов,  и " + minTime + " минут. ");

            }
        } catch (DateTimeException exception) {
            log.error(exception.getMessage());
        }


    }
}


