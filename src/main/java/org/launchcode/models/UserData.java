package org.launchcode.models;

import java.util.*;

public class UserData {

    private static Map<Integer, User> users = new HashMap<>();

    public static void addUser(User user) {
        users.put(user.getId(), user);
    }

    public Collection<User> getAll() {
        return users.values();
    }

    public User getUserById(int id) {
        return users.get(id);
    }


}
