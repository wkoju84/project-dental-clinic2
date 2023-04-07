package com.dentalclinic.project.services;

import com.dentalclinic.project.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements IDao<User>{

    private static Map<Integer, User> users = new HashMap<>();//Simulating a fake database
    @Override//Simulation of the save method (JPA)
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> searchAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public String exclude(Integer id) {
        users.remove(id);
        return "The record has been removed.";
    }
}
