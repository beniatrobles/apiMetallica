package com.api.apiMetallica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.NewModel;

@Repository

public interface INewRepository extends JpaRepository<NewModel,Long> {

}
