package com.example.loosecoupling;

public class UserDatabase implements UserDataProvider {
    @Override 
    public String getUserDetails() {
        return "User Details from here";
    }
}