package de.ait.homework28_1;

/*
Упражнение 1: Базовая структура социальной сети
Описание задания
Создайте классы для моделирования базовой социальной сети. Для выполнения задания необходимо:

Создать базовый класс User с атрибутами:

id (уникальный идентификатор пользователя),
name (имя пользователя),
email (электронная почта).
В классе должны быть методы:

Конструктор для инициализации атрибутов,
Метод для вывода информации о пользователе.
Создать класс PremiumUser, который наследует класс User. В этом классе добавьте:

Атрибут subscriptionEndDate (дата окончания подписки),
Метод для проверки, активна ли подписка (возвращает true или false в зависимости от текущей даты).
Создать класс AdminUser, который также наследует класс User. Добавьте:

Метод banUser(User user), который запрещает доступ другому пользователю
 (запрещённый пользователь может быть сохранён в списке).
Важно: Используйте полиморфизм для обработки пользователей разных типов.
Например, метод для отображения информации должен корректно работать для любого из классов User,
 PremiumUser и AdminUser.

Результат выполнения:
В результате работы должен быть создан код, который демонстрирует возможность взаимодействия между
 разными типами пользователей.


 */
public class User {
     protected String id;
     protected String name;
     protected String email;





    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name can not be null or empty.");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        } else {
            System.out.println("Email can not be null or empty.");
        }
    }

    public void showInfo (){
        System.out.println("Id : " + id + ", name: " + name + ", email: " + email);

    }



}
