package de.ait.homework40;
 /*
    Упражнение 1: Чтение и вывод списка задач
Задача: Создайте текстовый файл tasks.txt, в котором будут храниться задачи.
Каждая задача должна быть на новой строке.
Например:
Купить молоко
Позвонить другу
Сделать домашнее задание

Напишите программу на Java,
которая будет читать этот файл с помощью BufferedReader и выводить список задач в консоль.
Что нужно сделать:

Создайте файл tasks.txt и добавьте в него несколько задач, каждую с новой строки.
Напишите программу, которая читает файл и выводит задачи в консоль.
     */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static de.ait.homework40.AddTaskStream.scanner;


public class TasksStreamWrite {

    private static  List<String> taskList = List.of("Купить молоко","Позвонить другу","Сделать домашнее задание");

    public static List<String> getTaskList() {
        return taskList;
    }

    public static void main(String[] args) {


        String textToWrite ="";
        for(int i =0; i< taskList.size();i++){
            textToWrite = textToWrite +taskList.get(i)+"\n";
        }

        try (FileWriter writer = new FileWriter("tasks.txt")) {
            writer.write(textToWrite);
            System.out.println("Запись завершена!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }



    }




