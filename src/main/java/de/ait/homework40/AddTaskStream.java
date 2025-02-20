package de.ait.homework40;



import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;
import java.util.Scanner;


public class AddTaskStream {
    private   static List <String> list = TasksStreamWrite.getTaskList();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
TasksStreamWrite tasksStreamWrite = new TasksStreamWrite();


        System.out.println("Введите новую задачу: ");
        String taskToAdd = scanner.nextLine();
        scanner.nextLine();
        if (taskToAdd == null || taskToAdd.isEmpty()) {
            System.out.println(" Task is null or empty");
        } else {
            list.add(taskToAdd);


            String textToWrite = "";
            for (int i = 0; i < list.size(); i++) {
                textToWrite = textToWrite + list.get(i) + "\n";
            }

            try (FileWriter writer = new FileWriter("tasks.txt")) {
                writer.write(textToWrite);
                System.out.println("Запись завершена!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();
        }


    }



}



