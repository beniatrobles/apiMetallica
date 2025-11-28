package com.api.apiMetallica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.apiMetallica.models.UserModel;
import com.api.apiMetallica.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/nombre/{nombreUsuario}")
    public Optional<UserModel> getUserByNombre(@PathVariable String nombreUsuario) {
        return userService.getUserByNombreUsuario(nombreUsuario);
    }

    @GetMapping("/email/{email}")
    public Optional<UserModel> getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        // Aquí deberías hacer hashing de la contraseña antes de guardar
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

