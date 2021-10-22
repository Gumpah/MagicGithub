package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() { // Modified
        return apiService.getUsers();
    }

    public void generateRandomUser() { // Modified
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) { // Modified
        apiService.deleteUser(user);
    }
}
