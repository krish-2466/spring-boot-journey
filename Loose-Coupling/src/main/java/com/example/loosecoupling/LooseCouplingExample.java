package com.example.loosecoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvide = new UserDatabase();
        UserManager userManager = new UserManager(databaseProvide);
        System.out.println(userManager.getUserInfo());
    }
}