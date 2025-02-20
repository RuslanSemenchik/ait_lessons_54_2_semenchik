package de.ait.homework40;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TasksStreamReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("tasks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }catch (FileNotFoundException exception){
                exception.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
