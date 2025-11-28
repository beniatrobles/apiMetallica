package com.api.apiMetallica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.UserModel;
import com.api.apiMetallica.repositories.IUserRepository;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<UserModel> getUserByNombreUsuario(String nombreUsuario) {
        return userRepository.findByNombreUsuario(nombreUsuario);
    }

    public Optional<UserModel> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

