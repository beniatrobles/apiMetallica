package com.api.apiMetallica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.MerchModel;

@Repository

public interface IMerchRepository extends JpaRepository<MerchModel, Long> {
    // Obtener los primeros 5 productos merch ordenados por id (los más recientes si
    // quieres por fecha puedes cambiar)
    @Query(value = "SELECT * FROM merch ORDER BY id ASC LIMIT 5", nativeQuery = true)
    List<MerchModel> findTop5Merch();

    @Query(value = "SELECT DISTINCT categoria FROM merch", nativeQuery = true)
    List<String> findDistinctCategories();

}
