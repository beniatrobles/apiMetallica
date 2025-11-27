package com.api.apiMetallica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.AlbumModel;

@Repository
public interface IAlbumRepository extends JpaRepository<AlbumModel,Long> {

}
