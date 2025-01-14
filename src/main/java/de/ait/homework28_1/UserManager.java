package de.ait.homework28_1;

import java.time.LocalDate;

public class UserManager {
    public static void main(String[] args) {

User user = new User("1", "Mike","mike@com");
        PremiumUser premiumUser = new PremiumUser("100", "Stas", "stas@gmail.com", LocalDate.of(2025, 2, 8));

        AdminUser adminUser = new AdminUser("888", "Admin","admin@gmail.com");
        premiumUser.showInfo();
        premiumUser.isSubscriptionValid();
        adminUser.showInfo();
        adminUser.banUser(user);
        adminUser.banUser(premiumUser);



        for( User element : AdminUser.bannedUsers){
            element.showInfo();
        }



    }
}
