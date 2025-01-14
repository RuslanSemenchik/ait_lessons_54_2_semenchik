package de.ait.homework28_1;

import java.util.ArrayList;

public class AdminUser extends User{

    public AdminUser(String id, String name, String email) {
        super(id, name, email);
    }
protected  static ArrayList<User>bannedUsers = new ArrayList<>();

public void banUser(User user){
    if (user == null){
        System.out.println("User is null");
    }
    else {
    bannedUsers.add(user);
    System.out.println("User ID " + user.getId() + " added");


}
}
}


