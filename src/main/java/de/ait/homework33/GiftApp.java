package de.ait.homework33;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class GiftApp {

    private static final Logger log = LoggerFactory.getLogger(GiftApp.class);
    private static Scanner scanner = new Scanner(System.in);
    private static  GiftManager giftManager = new GiftManager();
    public static void main(String[] args) {
        boolean run = true;


        while (run) {
            showMenu(); // Показываем меню
            int choice = scanner.nextInt(); // Считываем выбор пользователя
            // Считываем оставшийся перевод строки
            scanner.nextLine();


            switch (choice) {
                case 1 -> {
                    // Добавление нового подарка
                    System.out.println("Введите название подарка: ");
                    String name = scanner.nextLine(); // Название подарка

                    System.out.println("Выберите категорию (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES): ");

                   try {
                       GiftCategory category = GiftCategory.valueOf(scanner.nextLine());
                       if (category == null) {
                           System.out.println("");
                       }

                       System.out.println("Выберите статус (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED):  ");
                       GiftStatus status = GiftStatus.valueOf(scanner.nextLine());

                       Gift gift = new Gift(name, category, status);
                       giftManager.addGift(gift);
                   } catch (IllegalArgumentException exception){
                       System.out.println("Error adding gift"+ exception.getMessage());
                       log.error("Error adding gift"+ exception.getMessage());
                   }

                }
                case 2 -> {
                    //Список всех подарков
                    giftManager.showGifts();
                    break;
                }
                case 3 -> {
                    //  Фильтровать подарки по категории
                    System.out.println("Введите категорию для фильтрации (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES):");
                    GiftCategory category = GiftCategory.valueOf(scanner.nextLine());
                    giftManager.filterByCategory(category);




                }
                case 4 -> {
                    //  Фильтровать подарки по категории
                    System.out.println("Введите название подарка, чтобы обновить его статус: ");
                    String giftName = scanner.nextLine(); //
                    System.out.println("Выберите новый статус (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED):");
                    GiftStatus newStatus = GiftStatus.valueOf(scanner.nextLine());
                    giftManager.updateGiftStatus(giftName,newStatus);


                }

                case 5 -> {
                    // Завершение работы приложения

                    System.out.println("Выход из программы. Спасибо за использование!");
                    run = false;
                    scanner.close();
                }
                default -> System.out.println("Неверно введены данные"); // Сообщение об ошибке при неверном вводе
            }
        }
    }


    private static void showMenu() {
        System.out.println("Добро пожаловать в систему управления подарками!");
        System.out.println("\nВыберите действие:");
        System.out.println("1. Добавить подарок");
        System.out.println("2. Показать все подарки");
        System.out.println("3. Фильтровать подарки по категории");
        System.out.println("4. Обновить статус подарка");
        System.out.println("5. Выход");
    }

}






