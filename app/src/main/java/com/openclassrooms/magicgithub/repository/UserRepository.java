package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return apiService.getUsers();
    } // Modified

    public void generateRandomUser() {
        apiService.generateRandomUser();
    } // Modified

    public void deleteUser(User user) {
        apiService.deleteUser(user);
    } // Modified
}
