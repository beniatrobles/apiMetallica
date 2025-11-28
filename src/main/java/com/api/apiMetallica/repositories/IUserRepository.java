package com.api.apiMetallica.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

    // Buscar usuario por nombre
    Optional<UserModel> findByNombreUsuario(String nombreUsuario);

    // Buscar usuario por email
    Optional<UserModel> findByEmail(String email);
}

