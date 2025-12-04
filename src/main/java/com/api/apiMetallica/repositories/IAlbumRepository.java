package com.api.apiMetallica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.AlbumModel;

@Repository
public interface IAlbumRepository extends JpaRepository<AlbumModel, Long> {

    @Query(value = "SELECT * FROM album ORDER BY RAND() LIMIT 3", nativeQuery = true)
    List<AlbumModel> findRandom3();

}
