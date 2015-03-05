package com.seanrobinson.customlistactivity;

import java.util.ArrayList;

/**
 * Created by seanrobinson on 04/03/2015.
 */
public class User {
    private String name;
    private String hometown;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Ade", "Amarillo"));
        users.add(new User("Bill", "Bedford"));
        users.add(new User("Cyril", "Switzerland"));
        users.add(new User("Dennis", "Dublin"));
        users.add(new User("Egret", "Edinburgh"));
        users.add(new User("Fred", "Finland"));

        return users;
    }
}
