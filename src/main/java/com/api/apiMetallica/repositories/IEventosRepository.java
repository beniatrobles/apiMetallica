package com.api.apiMetallica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.EventosModel;

@Repository

public interface IEventosRepository extends JpaRepository<EventosModel, Long> {

}
