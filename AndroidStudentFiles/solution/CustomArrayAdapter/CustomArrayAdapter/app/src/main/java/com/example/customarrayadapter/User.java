package com.example.customarrayadapter;

import java.util.ArrayList;

/**
 * Created by rf711 on 03/03/2015.
 */
public class User {
    public String name;
    public String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Ade", "Amarillo"));
        users.add(new User("Bill", "Bedford"));
        users.add(new User("Cyril", "Copenhagen"));
        users.add(new User("Dennis", "Dublin"));
        users.add(new User("Egret", "Edinburgh"));
        users.add(new User("Fred", "Finland"));
        users.add(new User("Gertrude", "Germany"));
        users.add(new User("Hilda", "Hungary"));
        users.add(new User("Isolde", "Iceland"));


        return users;
    }
}
