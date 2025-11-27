package com.api.apiMetallica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.SongModel;

@Repository
public interface ISongRepository extends JpaRepository<SongModel, Long> {

    List<SongModel> findByAlbumId(Long albumId);

}
