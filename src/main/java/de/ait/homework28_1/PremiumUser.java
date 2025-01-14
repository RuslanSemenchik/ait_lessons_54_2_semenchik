package de.ait.homework28_1;

import java.time.LocalDate;

public class PremiumUser extends User {
     protected LocalDate subscriptionEndDate;

    public PremiumUser(String id, String name, String email, LocalDate subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;

    }
    @Override
    public void showInfo (){
        super.showInfo();
        System.out.println("SubscriptionEndDate : " + subscriptionEndDate );

    }

    public boolean isSubscriptionValid () {

        System.out.println("Subscription  of premium user : "+ getName()+ " is valid  : "+   LocalDate.now().isBefore(subscriptionEndDate));

           return LocalDate.now().isBefore(subscriptionEndDate);

        }


    }


